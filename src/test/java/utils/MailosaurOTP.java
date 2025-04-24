package utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MailosaurOTP {
    private static final String API_KEY = "0ntqxbnnHoi3nnnqpLenIQIRINcq4UQt";
    private static final String SERVER_ID = "crhkfjm1";
    private static final String BASE_URL = "https://mailosaur.com/api/";

    public static String getOTP() throws Exception {
        // Step 1: Define the unique email address
        String email = "afternoon-younger@crhkfjm1.mailosaur.net";

        // Step 2: Retrieve OTP from Mailosaur
        String id = fetchID(email);
        String otp = retrieveOTPFromMessage(id);
        return otp;
//        if (id != null) {
//            System.out.println("Retrieved OTP: " + id);
//        } else {
//            System.out.println("No ID found for email: " + email);
//        }
//        if (otp != null) {
//            System.out.println("Retrieved OTP: " + otp);
//        } else {
//            System.out.println("No OTP found for email: " + email);
//        }
    }

    private static String fetchID(String email) throws Exception {
        // Set up the Mailosaur API request URL to get messages
        String url = BASE_URL + "messages?server=" + SERVER_ID + "&sentTo=" + email;
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Basic " + java.util.Base64.getEncoder().encodeToString((API_KEY + ":").getBytes()));

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        // Parse the JSON response to get the ID from the first message
        JSONObject response = new JSONObject(content.toString());
        JSONArray messages = response.getJSONArray("items");

        if (!messages.isEmpty()) {
            // Return the ID of the first message item
            return messages.getJSONObject(0).getString("id");
        }
        return null;
    }


    private static String retrieveOTPFromMessage(String messageId) throws Exception {
        // Set up the request URL for a specific message
        String url = BASE_URL + "messages/" + messageId;
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Basic " + java.util.Base64.getEncoder().encodeToString((API_KEY + ":").getBytes()));

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        // Parse the message JSON
        JSONObject message = new JSONObject(content.toString());
        JSONObject html = message.optJSONObject("html");
        JSONArray codes = html != null ? html.optJSONArray("codes") : null;

        if (codes != null) {
            for (int i = 0; i < codes.length(); i++) {
                JSONObject codeObject = codes.getJSONObject(i);
                String codeValue = codeObject.optString("value", "");

                // Check if the codeValue matches a 4-digit OTP pattern
                if (codeValue.matches("\\b\\d{4}\\b")) {
                    return codeValue;
                }
            }
        }

        return null; // Return null if no OTP is found
    }


}
