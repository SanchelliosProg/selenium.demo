@jquery-select-dropdown
Feature: Single Select - Search and Select country

  Scenario Outline: Drop Down with Search box
    When select country "<country>"
    Then "<country>" is viewed as selected on Select Country element
    Examples:
      | country      |
      | Australia    |
      | Bangladesh   |
      | Denmark      |
      | India        |
      | Japan        |
      | South Africa |

  Scenario: Select Multiple Values - add
    When choose "Alabama" from select state
    Then "Alabama" is viewed in the Select State element
    When choose "Colorado" from select state
    Then "Alabama, Colorado" is viewed in the Select State element
#
#  Scenario: Select Multiple Values - delete
#    Given choose "Arizona, Maine" from select state
#    When remove "Arizona" from select state
#    Then "Maine" is viewed in the Select State element
#
#  Scenario: Drop Down with Disabled values
#    When choose "Guam" from Select US Outlying Territories
#    Then "American Samoa" is viewed as chosen in Select US Outlying Territories
#
#  Scenario Outline: Drop-down with Category related options
#    When select <option> from Select a file
#    Then <option> is viewed as choise in select file section
#    Examples:
#      | option     |
#      | Ruby       |
#      | C          |
#      | Other file |