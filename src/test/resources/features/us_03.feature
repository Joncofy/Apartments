@demo @us3
  Feature: As a user I want to explore Rental features on the home page

    Scenario: Verify Rental feature links are clickable and working properly
      Given User is one the apartments.com home page
      When User scrolls down to the Explore Rentals section
      Then User should be able to click on the each of listing and verify title