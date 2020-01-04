@select-dropdown-list-feature
Feature: This would be your first example on select droped down list to with Selenium.
  We have listed two examples 1. Single Select and 2. Multi Select

  Scenario Outline: Select List Demo
    When select a day: "<day>"
    Then label with text "<result_label_text>" appears

    Examples:
      | day       | result_label_text         |
      | Sunday    | Day selected :- Sunday    |
      | Monday    | Day selected :- Monday    |
      | Tuesday   | Day selected :- Tuesday   |
      | Wednesday | Day selected :- Wednesday |
      | Thursday  | Day selected :- Thursday  |
      | Friday    | Day selected :- Friday    |
      | Saturday  | Day selected :- Saturday  |

  Scenario: Multi Select List Demo - nothing selected
    Given nothing is selected
    When press "First Selected" button
    Then text "First selected option is : undefined" appears
    When press "Get All Selected" button
    Then text "Options selected are :" appears

  @reload
  Scenario Outline: Multi Select List Demo - First Selected is last selected
    Given select "<first>"
    And select "<second>"
    And select "<third>"
    When press "First Selected" button
    Then text "<label_text>" appears

    Examples:
      | first      | second   | third      | label_text                            |
      | Washington | Texas    | Ohio       | First selected option is : Ohio       |
      | California | Florida  | Ohio       | First selected option is : Ohio       |
      | Florida    | New York | California | First selected option is : California |
      | Washington | New York | Florida    | First selected option is : Florida    |

  @reload
  Scenario: Multi Select List Demo - First Selected - All
    Given select "all"
    When press "First Selected" button
    Then text "First selected option is : Washington" appears

  Scenario: Multi Select List Demo - Get All Selected returns last selected element
    When select "Texas"
    And press "Get All Selected" button
    Then text "Options selected are : Texas" appears
    When select "Ohio"
    And press "Get All Selected" button
    Then text "Options selected are : Ohio" appears
    When select "Washington"
    And press "Get All Selected" button
    Then text "Options selected are : Washington" appears


