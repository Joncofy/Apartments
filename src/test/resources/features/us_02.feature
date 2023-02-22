@demo @us2
Feature: As a user I want to use search box on the home page

  Scenario Outline: Verify search functionality is working properly
    Given User is one the apartments.com home page
    When User clicks on the search box and type "<cities>"
    And  User should click on the search link
    Then User should see the title of the page contains the input text

    Examples:
    | cities      |
    | Los Angeles |
    | Chicago     |
    | New York    |
    | Miami       |
    | Austin      |
    | Irvine      |


