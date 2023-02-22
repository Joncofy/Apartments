package project1.apartments.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import project1.apartments.pages.HomePage;
import project1.apartments.utilities.Driver;
import project1.apartments.utilities.UI_Utilities;
import static org.junit.Assert.*; // make Assert static to be able to use all methods without repetitions

import java.util.ArrayList;
import java.util.List;

public class User_Story_03 {

    HomePage homePage = new HomePage();

    static List<String> actualListing = new ArrayList<>();
    @When("User scrolls down to the Explore Rentals section")
    public void user_scrolls_down_to_the_explore_rentals_section() {
        UI_Utilities.scrollToElement(homePage.listingSection);
        for (int i = 0; i < homePage.homePageListing.size(); i++) {
            actualListing.add(homePage.elemOfListing().get(i).getText());
            System.out.println("homePage.elemOfListing().get(i).getText() = " + homePage.elemOfListing().get(i).getText());
        }
    }

    @Then("User should be able to click on the each of listing and verify title")
    public void user_should_be_able_to_click_on_the_each_of_listing_and_verify_title() {
        UI_Utilities.waitForPageToLoad(8);
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 0; i < homePage.homePageListing.size(); i++) {
            homePage.homePageListing.get(i).click();
            UI_Utilities.waitForPageToLoad(8);
            UI_Utilities.verifyTitleContains(actualListing.get(i));
            homePage.apartmentsHeaderLink.click();
            UI_Utilities.scrollToElement(homePage.listingSection);
        }
    }
}
