@demo @us1
  Feature: As a user I want to click on the each element from the Home Page header section

    Background:
      Given User is one the apartments.com home page

    Scenario Outline: Verify each element from the header navigation is clickable
      When User clicks on the "<headerLinks>"
      Then User should see the "<expectedResults>"

      Examples:
     | headerLinks       | expectedResults             |
     | Manage Rentals    | Rental Manager              |
     | Sign Up           | Create an account           |
     | Sign In           | Sign into your account      |
     | Add a Property    | Nationwide Apartment Finder |


    Scenario: Verify Apartments.com link takes you on the home page and English link is intractable and shows options
      When User clicks on the Apartments.com
      And User should see "Apartments and Homes for Rent"
      And User clicks on the English
      Then User should see "Language" pop menu


      Scenario: Verify Menu dropDown element clickable and has some options
        When User clicks on the Menu
        Then User should see some dropDown elements
      | Renter Tools        |
      | Manage Rentals      |
      | Apartments For Rent |
      | Homes For Rent      |
      | Condos For Rent     |
      | Townhomes For Rent  |
      | Help Center         |



