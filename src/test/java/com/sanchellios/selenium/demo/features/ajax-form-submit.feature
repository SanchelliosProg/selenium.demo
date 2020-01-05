@ajax-form-submit
Feature: Ajax Form Submit with Loading icon


  Scenario: Submit form
    Given name field is filled with name "Ajax"
    When click submit button
    Then form is submitted and label Form submited Successfully! appears
    And submit button is not visible


  Scenario: Reject to submit empty form
    Given nothing is written to the fields of the form
    When click submit button
    Then name field becomes red