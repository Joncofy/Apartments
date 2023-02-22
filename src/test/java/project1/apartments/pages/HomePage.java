package project1.apartments.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='header-switch-language-wrapper mortar-wrapper']")
    public WebElement headerLanguages;

    @FindBy(id = "modal-header")
    public WebElement modalHeaderLanguage;

    @FindBy(xpath = "//div[@id='registrationForm']//p[.='Create an account']")
    public WebElement createAnAccount;

    @FindBy(xpath = "//div//h2[@id='loginModalHeader']")
    public WebElement signInToYourAccount;

    @FindBy(xpath ="//iframe[@id='iFrameResizer0']")
    public WebElement iframeLoginImgForm;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement iframeCloseButton;

    @FindBy(id = "appStoreAction")
    public WebElement appStoreLink;

    @FindBy(id = "googlePlayAction")
    public WebElement googlePlayLink;

    @FindBy(id ="headerMenuLink")
    public WebElement headerMenuButton;

    @FindBy(xpath = "//header//div[@id='menuNavContainer']//li//a")
    public List<WebElement> lisOfBurgerMenu;


    @FindBy(id="quickSearchLookup")
    public WebElement homePageSearchBox;

    @FindBy(xpath = "//a[@class='go']")
    public WebElement searchLink;

    @FindBy(id = "quickSearchLookup_typeahead_0")
    public WebElement firstSearchElement;

    @FindBy(xpath = "//div[@class='homepage-listing-body']")
    public List<WebElement> exploreRentalsOptions;

    @FindBy(xpath = "//a[@aria-label='Apartments.com logo visited to home link']")
    public WebElement apartmentsHeaderLink;

    @FindBy(xpath = "//a[@class='footerLogo']")
    public WebElement apartmentsFooterLink;

    @FindBy(xpath = "//p//a[@title='Equal Housing Opportunity']")
    public WebElement equalHousingSocialLink;

    @FindBy(xpath = "//a[@class='homepage-listing js-viewAnalyticsSection']")
    public List<WebElement> homePageListing;

    @FindBy(xpath = "//section[@class='homepage-featured']")
    public WebElement listingSection;
}
