package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]")
    WebElement loginButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[2]")
    private WebElement logoutButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[4]")
    private WebElement signupButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]")
    private WebElement adminButton;
    @FindBy (xpath = "//*[@id=\"list-item-117\"]")
    private WebElement citiesButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button")
    private WebElement languageButton;
    @FindBy (xpath = "//*[@id=\"list-item-89\"]/div")
    private WebElement enButton;
    @FindBy (xpath = "//*[@id=\"list-item-75\"]")
    private WebElement esButton;
    @FindBy (xpath = "//*[@id=\"list-item-77\"]")
    private WebElement frButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/h1")
    private WebElement headerText;
    @FindBy (xpath = "(//a[@href='/profile'])[1]")
    private WebElement myProfileButton;

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLogOutButton() {
        return logoutButton;
    }

    public WebElement getSignupButton() {
        return signupButton;
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public void clickAdminButton() {
        adminButton.click();
    }

    public void clickCitiesButton() {
        citiesButton.click();
    }

    public void clickLanguageButton() {
        languageButton.click();
    }

    public void clickEnButton() {
        enButton.click();
    }
    public void clickFrButton() {
        frButton.click();
    }

    public void clickEsButton() {
        esButton.click();
    }

    public WebElement getHeaderText() {
        return headerText;
    }

    public void clickMyProfileButton() {
        myProfileButton.click();
    }
}

