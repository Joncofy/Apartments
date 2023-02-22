package project1.apartments.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*; // make Assert static to be able to use all methods without repetitions

import org.openqa.selenium.interactions.Actions;
import project1.apartments.pages.HomePage;
import project1.apartments.utilities.Driver;
import project1.apartments.utilities.UI_Utilities;

public class User_Story_02 {

    HomePage homePage = new HomePage();
    static String citiesName;

    @When("User clicks on the search box and type {string}")
    public void user_clicks_on_the_search_box_and_type(String cities) {
       homePage.homePageSearchBox.sendKeys(cities);
       citiesName = cities;
    }
    @When("User should click on the search link")
    public void user_should_click_on_the_search_link(){
      Actions actions = new Actions(Driver.getDriver());
      UI_Utilities.waitForClickability(homePage.firstSearchElement,5);
      actions.moveToElement(homePage.firstSearchElement).pause(1).click().perform();

    }
    @Then("User should see the title of the page contains the input text")
    public void user_should_see_the_title_of_the_page_contains_the_input_text() {
        UI_Utilities.waitFor(5);
       assertTrue(Driver.getDriver().getTitle().contains(citiesName));
    }
}
