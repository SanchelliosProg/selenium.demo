@radio-button
Feature: This is again simple example to start working with radio buttons using Selenium.
  https://www.seleniumeasy.com/test/basic-radiobutton-demo.html

  Scenario Outline: Radio Button Demo
    When select "<selected_radio>" radio-button
    And click "Get Checked value" button
    Then label with text "<text_in_label>" should appear

    Examples:
      | selected_radio | text_in_label                    |
      | Male           | Radio button 'Male' is checked   |
      | Female         | Radio button 'Female' is checked |

  Scenario Outline: Group Radio Buttons Demo
    When select sex: "<sex_radio>" radio-button
    And select age group: "<age_group_radio>"
    And click "Get values" button
    Then result label contains text: "<label>"

    Examples:
      | sex_radio | age_group_radio | label                          |
      | Male      | 0 to 5          | Sex : Male\nAge group: 0 - 5     |
      | Male      | 5 to 15         | Sex : Male\nAge group: 5 - 15    |
      | Male      | 15 to 50        | Sex : Male\nAge group: 15 - 50   |
      | Female    | 0 to 5          | Sex : Female\nAge group: 0 - 5   |
      | Female    | 5 to 15         | Sex : Female\nAge group: 5 - 15  |
      | Female    | 15 to 50        | Sex : Female\nAge group: 15 - 50 |
