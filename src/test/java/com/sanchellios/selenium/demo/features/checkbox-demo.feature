@checkbox
Feature: This would be a basic example to start with checkboxes using selenium
  The HTML input "checkbox" is an input element to enter an array of different values.
  Each input type checkbox has value attribute which is used to define the value submitted by the checkbox.

  Scenario: Single Checkbox Demo
    When click on single checkbox
    Then "Success - Check box is checked" appears on Single Checkbox Demo

  Scenario: Multiple Checkbox Demo - check all
    When click on "Check All" to check all checkboxes at once
    Then All checkboxes are "selected"

  Scenario: Multiple Checkbox Demo - check all
    Given click on "Check All" to check all checkboxes at once
    When click on "Uncheck All" to check all checkboxes at once
    Then All checkboxes are "unselected"


