# POC test automation for web application

## Built using
- Java
- Gradle
- Cucumber
- Selenium

## Important notes
- Website used in this POC: Traveloka
- Feature files located in `src/test/resources/features`
- Report files still located in `build/reports/tests/test` in your local after run

## How to run
- Clone this project
- Open in IDE, wait until gradle build is finished
- Running the test
    - Right click from the feature file then choose run
    - Open the feature file then choose run from the left of scenario line
    - Using command `./gradlew test`
    - You may add parameter of cucumber tags or options to gradle command above
        - `-Dcucumber.options="--tags @Test123" -DlogLevel=DEBUG`