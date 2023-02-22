package project1.apartments.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project1.apartments.utilities.Driver;

import java.util.List;

/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 */
public  class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement header_navigate_moduleTop(String TopModuleName){
        return Driver.getDriver().findElement(By.xpath("//header//a[@title='"+TopModuleName+"']"));
    }

    public WebElement header_navigation_wrapper_menu(String navigationWrapperName){
        return Driver.getDriver().findElement(By.xpath("//header//li//a[contains(text(),'"+navigationWrapperName+"')]"));
    }

    public WebElement home_page_buttons(String homePageButtons ){
        return Driver.getDriver().findElement(By.xpath("//button[contains(text(),'"+homePageButtons+"')]"));
    }

    public WebElement home_page_links(String homePageLinks){
        return Driver.getDriver().findElement(By.xpath("//a[contains(text(),'"+homePageLinks+"')]"));
    }

    public WebElement home_page_links_section(String homePageLinksSection){
        return Driver.getDriver().findElement(By.xpath("//section[@id='linksSection']//a[.='"+(homePageLinksSection)+"']"));
    }
    public List<WebElement> elemOfListing(){
        return Driver.getDriver().findElements(By.xpath("//a[@class='homepage-listing js-viewAnalyticsSection']//h3"));
    }


    public WebElement home_page_footer_links_section(String homePageFooterLinksSection){
        return Driver.getDriver().findElement(By.xpath("//footer[@id='mainFooter']//a[.='"+(homePageFooterLinksSection)+"']"));
    }
    public WebElement home_page_footer_socialMedia(String homePageFooterSocialMedia){
        return Driver.getDriver().findElement(By.xpath("//a[@aria-label='"+homePageFooterSocialMedia.toLowerCase()+"']"));
    }
}
