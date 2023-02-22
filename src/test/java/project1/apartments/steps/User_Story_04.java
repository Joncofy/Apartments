package project1.apartments.steps;
import static org.junit.Assert.*; // make Assert static to be able to use all methods without repetitions
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import project1.apartments.pages.HomePage;
import project1.apartments.utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User_Story_04 {

    HomePage homePage = new HomePage();
    static List<String> expectedTitle = new ArrayList<>();
    static Set<String> windowHandles = Driver.getDriver().getWindowHandles();
    @When("User clicks on list of buttons")
    public void user_clicks_on_list_of_buttons(List<String> listOfTabs){
        Actions actions = new Actions(Driver.getDriver());
        expectedTitle.add(Driver.getDriver().getTitle());
        for (int i = 0; i <listOfTabs.size() ; i++) {
            expectedTitle.add(listOfTabs.get(i));
            actions.moveToElement(homePage.home_page_buttons(listOfTabs.get(i))).click().perform();
        }
    }

    @Then("User should verify the title of new tabs")
    public void user_should_verify_the_title_of_new_tabs() {
        int count = 0;
        for(String each:windowHandles){
            Driver.getDriver().switchTo().window(each);
            assertTrue(Driver.getDriver().getTitle().contains(expectedTitle.get(count)));
            count++;
        }

    }

}
