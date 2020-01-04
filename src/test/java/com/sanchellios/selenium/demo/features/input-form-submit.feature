@input-form
Feature: Input form with validations (not really)

  Scenario: Submit values in the form
    Given fill form with data
      | First Name             | Jack                 |
      | Last Name              | Daniels              |
      | email                  | jack@jackdaniels.com |
      | phone                  | 212-85-06            |
      | address                | Lenina 13            |
      | City                   | Gorky                |
      | State                  | Wyoming              |
      | Zip                    | 191191               |
      | Website of domain name | google.com           |
      | Hosting                | true                 |
      | Project Description    | It doesn't matter    |
    When press the Send button
    Then all the form becomes empty
