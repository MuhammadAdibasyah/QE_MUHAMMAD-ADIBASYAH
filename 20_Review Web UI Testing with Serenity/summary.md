# Review Web UI Testing with Serenity

## Introduction Serenity BDD

Serenity adalah kerangka kerja bdd open-source yang membantu membuat tes penerimaan otomatis terstruktur
dengan baik dan dapat dipelihara.serenity arsitektur terdiri dari requirements,tests,steps,pages dan report.

### Define Requirments

- when using serenity,you start with the requirements you need to implement.
- these are often expressed as user "stories" with acceptance criteria that help clarify requirements.
- it is these "stories" that serenity automate.

### Automate Acceptance Criteria

- Next,describe the acceptance criteria in high-level business terms.
- record these acceptance criteria using either a BDD toll such as cucumber with the form "feature" so that
  serenity can run them.

### Implement the Test

- Implement the acceptance criteria into a code,so that they can run against the actual application
- under the hood test are broken down into nested steps for better readabillity and eariser maintance

### Report on Test Result

- A narative for each test
- Screenshots for each step in the test
- test result including execution times and error messages if a test failed

## BDD Framework with cucumber

1) Write story
2) Configure Stories
3) Browser Interaction
4) Run stories
5) View Reports

Writing The Test : 
- Serenity cucumber
- create file stories
- create file test class
- create file test steps
- create file npage objects

## Practice Scenario

### Write test story
- create file story in test resource root directory
- feature consist of 3 part : feature,scenario and gherkin syntax
- feature syntax should b like in the following picture

### Create Test Class 
- create test class in package test/java
- each given,when and then in file story should be represented only one function
- function annotated with corresponding gherkin syntax

### Create test steps
- creatre steps class that extend class scenarioSteps
- class name should ending with "steps" for each maitainability
- in this class,steps should call function that located in pageObjecct class

### Create page object
- create class that extends pageObject
- this class consist of function that locating and operating website element
- theres no restriction on how to locate the element

### Run the test
