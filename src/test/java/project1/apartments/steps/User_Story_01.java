package project1.apartments.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*; // make Assert static to be able to use all methods without repetitions

import project1.apartments.pages.HomePage;
import project1.apartments.utilities.ConfigurationReader;
import project1.apartments.utilities.Driver;
import project1.apartments.utilities.UI_Utilities;

import java.util.List;

public class User_Story_01 extends UI_Utilities{

    HomePage homePage = new HomePage();


    @Given("User is one the apartments.com home page")
    public void user_is_one_the_apartments_com_home_page() {
        assertTrue(Driver.getDriver().getTitle().contains("Apartments"));
    }
    @When("User clicks on the {string}")
    public void user_clicks_on_the(String headerLinks) {
        homePage.header_navigate_moduleTop(headerLinks).click();

    }
    @Then("User should see the {string}")
    public void user_should_see_the(String result) {
        waitForPageToLoad(2);
    switch (result){
        case "Property Management Tools":
            assertTrue(Driver.getDriver().getTitle().contains(result));
            System.out.println(Driver.getDriver().getTitle());
            System.out.println("result = " + result);
            break;
        case "Create an account":
            waitForVisibility(homePage.createAnAccount,2);
            assertTrue(homePage.createAnAccount.getText().contains(result));
            break;
        case "Sign into your account":
            waitForVisibility(homePage.iframeLoginImgForm,3);
            Driver.getDriver().switchTo().frame(homePage.iframeLoginImgForm);
            assertTrue(homePage.signInToYourAccount.getText().contains(result));
            break;
        case "Nationwide Apartment Finder":
            verifyTitleContains(result);
            break;
    }

    }
    @When("User clicks on the Apartments.com")
    public void user_clicks_on_the_apartments_com() {
    homePage.apartmentsHeaderLink.click();
        waitForPageToLoad(3);

    }
    @When("User should see {string}")
    public void user_should_see(String title) {
    assertTrue(Driver.getDriver().getTitle().contains(title));
    }
    @When("User clicks on the English")
    public void user_clicks_on_the_english() {
    homePage.headerLanguages.click();

    }
    @Then("User should see {string} pop menu")
    public void user_should_see_pop_menu(String language) {
    assertTrue(homePage.modalHeaderLanguage.getText().contains(language));
    }

    @When("User clicks on the Menu")
    public void userClicksOnTheMenu() {
        Driver.getDriver().get(ConfigurationReader.getProperty("apartments_URL"));
        homePage.headerMenuButton.click();
        waitForPageToLoad(1);
    }

    @Then("User should see some dropDown elements")
    public void userShouldSeeSomeDropDownElements(List<String> expectedListOfDropdown) {
        for (int i = 0; i < expectedListOfDropdown.size(); i++) {
            String actualText = homePage.header_navigation_wrapper_menu(expectedListOfDropdown.get(i)).getText();
            assertTrue(expectedListOfDropdown.get(i).contains(actualText));
        }
         }
}
