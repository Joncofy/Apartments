@demo @us4
Feature: As a User I want to click on home page links which will opens some new tabs

  Scenario: Verify list of links(buttons) and tabs
    Given User is one the apartments.com home page
    When User clicks on list of buttons
      | Find Out More        |
      | Browse Articles      |
      | List Your Property   |
      | Manage Your Property |
      | Stay Informed        |
    Then User should verify the title of new tabs