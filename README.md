# Selenium Cucumber Maven Project

This project is a **Selenium automation framework** using **Cucumber** with **Java** and **Maven**. It follows the **Page Object Model (POM)** for better maintainability and scalability.

## 📁 Project Structure

```
src/test/java
│── objectRepository/       # Stores Object Repository classes for UI elements
│   ├── PG005_TopUpPayment.java
│   ├── PG006_CardBillPayment.java
│   ├── PG007_BillPayment.java
│
│── resources/features/     # Stores feature files for Cucumber scenarios
│   ├── TC001_Navigation.feature
│   ├── TC002_Login.feature
│   ├── TC003_Dashboard_AccountAndCardSt.feature
│   ├── TC004_MetlifeBillPayment.feature
│   ├── ...
│
│── runners/                # Contains Test Runner class for Cucumber execution
│   ├── TestRunner.java
│
│── stepdefinitions/        # Holds step definition files for Cucumber scenarios
│   ├── Hooks.java
│   ├── PM001_SplashAndLogin.java
│   ├── PM002_Dashboard.java
│   ├── PM003_OwnFundTransfer.java
│   ├── ...
│
│── utils/                  # Utility classes for common functions
│   ├── Base.java
│   ├── Operations.java
```

## 🔹 Technologies Used

- **Selenium WebDriver** - UI automation
- **Cucumber** - BDD framework
- **Java** - Programming language
- **Maven** - Dependency management
- **JUnit/TestNG** - Test execution

## 🚀 How to Run the Tests

1. **Clone the Repository**  
   ```sh
   git clone <repository_url>
   ```

2. **Install Dependencies**  
   ```sh
   mvn clean install
   ```

3. **Run Tests Using Maven**  
   ```sh
   mvn test
   ```

4. **Run Specific Feature File**  
   ```sh
   mvn test -Dcucumber.options="src/test/resources/features/TC002_Login.feature"
   ```

## 🛠 Key Components

- **Object Repository (`objectRepository/`)**  
  Stores page objects for better code reusability.

- **Feature Files (`resources/features/`)**  
  Contains Gherkin syntax (`Given-When-Then`) for BDD scenarios.

- **Step Definitions (`stepdefinitions/`)**  
  Implements test steps for feature files.

- **Runner (`runners/`)**  
  Configures Cucumber execution.

- **Utilities (`utils/`)**  
  Contains helper classes like `Base.java` for setup and teardown.

## 📊 Reports and Logs

- After test execution, reports are generated under:
  ```
  target/cucumber-reports/
  ```

---

This structure ensures maintainability, scalability, and efficiency in test automation. 🚀 Happy Testing! 🎯
