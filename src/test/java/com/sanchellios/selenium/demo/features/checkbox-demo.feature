@checkbox
Feature: This would be a basic example to start with checkboxes using selenium
  The HTML input "checkbox" is an input element to enter an array of different values.
  Each input type checkbox has value attribute which is used to define the value submitted by the checkbox.

  https://www.seleniumeasy.com/test/basic-checkbox-demo.html

  Scenario: Single Checkbox Demo - box click
    When click on single checkbox
    Then "Success - Check box is checked" appears on Single Checkbox Demo
    And single checkbox is selected

    Scenario: Single Checkbox Demo - text click
      When click on text near single checkbox
      Then "Success - Check box is checked" appears on Single Checkbox Demo
      And single checkbox is selected

  Scenario: Multiple Checkbox Demo - check all
    When click on multi-checkbox-button
    Then All checkboxes are "checked"
    And Text on a button became "Uncheck All"

  Scenario: Multiple Checkbox Demo - check all
    Given click on multi-checkbox-button
    When click on multi-checkbox-button
    Then All checkboxes are "unchecked"
    And Text on a button became "Check All"


