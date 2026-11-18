\# 🚀 Rest Assured API Automation Framework



A Java-based API automation framework developed using \*\*Rest Assured, TestNG, and Maven\*\* to automate REST API testing, validate HTTP responses, and improve API testing efficiency.



The framework follows a structured approach to API automation with reusable components, positive and negative test scenarios, authentication validation, and automated HTML reporting using Extent Reports.



\---



\## 📌 Project Overview



This project demonstrates API test automation using Rest Assured with Java and TestNG.



The framework automates REST API requests and validates server responses across different test scenarios. It focuses on maintaining reusable test components, structured execution, and detailed reporting.



The framework also integrates Maven for dependency management and test execution, making it suitable for command-line execution and CI/CD integration through Jenkins.



\---



\## 🛠️ Technology Stack



| Technology | Purpose |

|---|---|

| Java 21 | Programming Language |

| Rest Assured | REST API Automation |

| TestNG | Test Execution and Assertions |

| Maven | Build and Dependency Management |

| Maven Surefire Plugin | Test Execution Integration |

| Extent Reports | HTML Test Reporting |

| Postman | Manual API Testing |

| Swagger | API Documentation and Endpoint Reference |

| Git \& GitHub | Version Control |

| Jenkins | CI/CD Integration |



\---



\## ✨ Key Features



\- \*\*API Automation:\*\* Automates REST API testing using Rest Assured.

\- \*\*Request Validation:\*\* Validates HTTP methods, headers, request parameters, and payloads.

\- \*\*Response Validation:\*\* Verifies HTTP status codes, response bodies, and response data.

\- \*\*Authentication Testing:\*\* Validates authorized and unauthorized API access.

\- \*\*Negative Testing:\*\* Covers invalid authentication tokens and incorrect request payloads.

\- \*\*Reusable Components:\*\* Organizes API automation components for maintainability and reduced code duplication.

\- \*\*TestNG Integration:\*\* Supports structured test execution through TestNG.

\- \*\*Maven Integration:\*\* Enables dependency management and command-line test execution.

\- \*\*Automated Reporting:\*\* Generates interactive HTML execution reports using Extent Reports.

\- \*\*CI/CD Integration:\*\* Supports automated test execution through Jenkins.



\---



\## 🧪 API Test Scenarios



The framework covers different API testing scenarios:



| Test Scenario | Expected Validation |

|---|---|

| Valid API Requests | Successful HTTP response |

| Invalid Authentication | HTTP 401 Unauthorized |

| Invalid Request Payload | HTTP 422 Unprocessable Entity |

| Response Validation | Response body and field-level assertions |

| Request Validation | Request headers, parameters, and payload |

| Negative Testing | Appropriate error responses for invalid inputs |



\---



\## 📊 Reporting – Extent Reports



The framework integrates \*\*Extent Reports with TestNG listeners\*\* to generate interactive HTML execution reports.



\### Reporting Components



| Component | Responsibility |

|---|---|

| TestNG ITestListener | Captures test execution lifecycle events |

| ExtentReports | Manages report configuration and execution data |

| ExtentSparkReporter | Generates interactive HTML reports |



\### Reporting Workflow



1\. TestNG initializes test execution.

2\. The custom listener captures test lifecycle events.

3\. Test execution results are recorded in Extent Reports.

4\. Passed, failed, and skipped test cases are logged.

5\. The report is flushed and generated as an HTML file.



\### Report Location



```text

reports/

&#x20;   ExtentReport.html

```



\### Report Highlights



\- Overall test execution summary.

\- Individual test case status.

\- Passed, failed, and skipped test cases.

\- Detailed execution logs.

\- Execution timestamps.

\- API request and response validation details (where logged).



Open the generated HTML file in any modern browser to view the execution report.



\---



\## 📁 Project Structure



```text

RestAssuredFramework/

│

├── src/

│   ├── main/

│   │   └── java/

│   │       ├── endpoints/

│   │       ├── payloads/

│   │       └── utilities/

│   │

│   └── test/

│       ├── java/

│       │   ├── tests/

│       │   ├── base/

│       │   └── listeners/

│       │

│       └── resources/

│

├── reports/

│   └── ExtentReport.html

│

├── pom.xml

├── testing.xml

├── Jenkinsfile

└── README.md

```



\*Note: The structure is illustrative. Update directory and package names to match the actual repository.\*



\---



\## ⚙️ Prerequisites



Ensure the following tools are installed:



\- Java Development Kit (JDK) 21

\- Apache Maven 3.9+

\- Git



Verify the installations:



```bash

java -version

mvn -version

git --version

```



\---



\## 🔧 Installation \& Setup



\### 1. Clone the Repository



```bash

git clone <YOUR\_GITHUB\_REPOSITORY\_URL>

```



\### 2. Navigate to the Project Directory



```bash

cd RestAssuredFramework

```



\### 3. Download Project Dependencies



```bash

mvn clean install

```



Maven automatically downloads and resolves the dependencies configured in `pom.xml`.



\---



\## ▶️ Test Execution



\### Execute the Complete Test Suite



```bash

mvn clean test

```



The Maven Surefire Plugin handles TestNG test execution based on the configuration defined in `pom.xml`.



\### Execute a Specific TestNG Suite



If your Surefire configuration supports the `suiteXmlFile` property:



```bash

mvn clean test -DsuiteXmlFile=testing.xml

```



\---



\## 📄 Test Execution Results



After execution, the framework generates reports in the following locations:



\*\*Extent Reports:\*\*



```text

reports/ExtentReport.html

```



\*\*Maven Surefire Reports:\*\*



```text

target/surefire-reports/

```



The reports provide visibility into test execution status, including passed, failed, and skipped test cases.



\---



\## 🔄 CI/CD Integration – Jenkins



The framework is designed for Jenkins-based continuous integration.



The intended pipeline workflow includes:



1\. Checkout source code from GitHub.

2\. Verify Java and Maven environments.

3\. Build the Maven project.

4\. Execute API automation test cases.

5\. Publish test execution results.



This integration enables automated API test execution through Jenkins and provides a foundation for continuous testing.



\---



\## 🎯 Key Learning Outcomes



Through this project, I gained practical experience in:



\- REST API automation using Rest Assured.

\- HTTP methods, status codes, and response validation.

\- Authentication and negative API testing.

\- Java-based test automation.

\- TestNG test execution and listener implementation.

\- Maven dependency and build management.

\- Automated HTML reporting using Extent Reports.

\- CI/CD concepts and Jenkins pipeline integration.



\---



\## 👨‍💻 Author



\*\*Kedar Gaikwad\*\*



B.Tech – Computer Science Engineering (AI \& ML)



\*\*Technical Interests:\*\* Java | API Automation Testing | Rest Assured | Selenium | CI/CD



\- GitHub: https://github.com/Kedarrrrr

\- LinkedIn: https://www.linkedin.com/in/kedar-gaikwad

