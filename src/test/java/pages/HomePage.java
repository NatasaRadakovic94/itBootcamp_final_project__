package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/div/div[3]/a[3]")
    private WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[2]")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/a[4]")
    private WebElement signupButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/header/div/div[3]/button[1]")
    private WebElement adminButton;

    @FindBy (xpath = "//*[@id=\"list-item-446\"]")
    private WebElement citiesButton;

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

}
