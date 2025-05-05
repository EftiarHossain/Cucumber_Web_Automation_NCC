package utils;

import objectRepository.PG004_FundTransfer;
import objectRepository.PG008_MfsFundTransferOR;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;

public class MfsElementMapper {

    public static class MfsConfig {
        public By selectionButton;
        public By transferDetailsTitle;
        public By toAccountInput;

        public By transferReviewTitle;

        public MfsConfig(By selectionButton, By transferDetailsTitle, By toAccountInput, By transferReviewTitle) {
            this.selectionButton = selectionButton;
            this.transferDetailsTitle = transferDetailsTitle;
            this.toAccountInput = toAccountInput;
            this.transferReviewTitle = transferReviewTitle;
        }
    }

    private static final Map<String, MfsConfig> mfsMap = new HashMap<>();

    static {
        mfsMap.put("bKash", new MfsConfig(
                PG008_MfsFundTransferOR.selectBkash,
                PG008_MfsFundTransferOR.bKashTransferDetailsScreenTitle,
                PG008_MfsFundTransferOR.mfsBkashToAccountInputField,
                PG008_MfsFundTransferOR.bKashReviewPageTitle
        ));
        mfsMap.put("Nagad", new MfsConfig(
                PG008_MfsFundTransferOR.selectNagad,
                PG008_MfsFundTransferOR.nagadTransferDetailsScreenTitle,
                PG008_MfsFundTransferOR.nagadToAccountInputField,
                PG008_MfsFundTransferOR.nagadReviewPageTitle
        ));
        mfsMap.put("Rocket", new MfsConfig(
                PG008_MfsFundTransferOR.selectRocket,
                PG008_MfsFundTransferOR.rocketTransferDetailsScreenTitle,
                PG008_MfsFundTransferOR.rocketToAccountInputField,
                PG008_MfsFundTransferOR.rocketReviewPageTitle
        ));
        mfsMap.put("Tap", new MfsConfig(
                PG008_MfsFundTransferOR.selectTap,
                PG008_MfsFundTransferOR.tapTransferDetailsScreenTitle,
                PG008_MfsFundTransferOR.tapToAccountInputField,
                PG008_MfsFundTransferOR.tapReviewPageTitle
        ));
    }

    public static MfsConfig getConfig(String mfsType) {
        return mfsMap.get(mfsType);
    }
}

