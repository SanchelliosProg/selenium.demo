@loading-data-dynamically
Feature: Clicking on 'Get New User' button will get new user every time with Image, First name and Last name
  Loading icon will be displayed until the request is processed

  Scenario: Profile
    When user click Get New User button
    Then photo of random user is loaded