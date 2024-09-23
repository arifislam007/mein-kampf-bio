## Post-Build Actions

After the build process in Jenkins, the following actions are performed:

1. **JUnit Test Execution**:
   - The project is configured to run JUnit tests automatically during the build process.
   - Tests are executed after the compilation phase to ensure that all functionalities are working as expected.

2. **Test Results Publishing**:
   - Jenkins captures the results of the JUnit tests and provides a summary of the outcomes.
   - You can view detailed reports, including passed and failed tests, directly in the Jenkins interface.

### Jenkins Configuration

To configure Jenkins for this project:

- **Maven Build**: 
  - Use the following command to clean, compile, and run tests:
    ```bash
    mvn clean compile test
    ```
- **JUnit Test Results**:
  - The results are stored in the default Maven Surefire directory, typically found at:
    ```
    target/surefire-reports/
    ```
  - Configure Jenkins to publish JUnit test results by adding the following path in the "Post-build Actions":
    ```
    **/target/surefire-reports/*.xml
    ```

### Viewing Test Results

After a successful build, you can access the test results from the Jenkins job dashboard:

- Click on the specific build number.
- Look for the "Test Result" section to see a summary of the executed tests.
