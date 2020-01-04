@simple-form
Feature: This would be your first example to start with Selenium.
  The tag input specifies an input field where the user can enter data.
  https://www.seleniumeasy.com/test/basic-first-form-demo.html

  @positive
  Scenario: Enter value into Single Input Field and press button
    When enter "MY MESSAGE" into the single input field
    And press the button "Show Message"
    Then "MY MESSAGE" appears in the Single Input Field section

  @positive
  Scenario: Two Input Fields form sum A and B values
    When enter 5 value into the A input field
    And enter 3 value into the B input field
    And press the button "Get Total"
    Then receive 8 as a sum


