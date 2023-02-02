package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;
    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;
    @FindBy (xpath = "//*[@id=\"app\"]/div/main/div/div[2]/div/div/div[3]/span/form/div/div[3]/button")
    private WebElement loginButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[4]/div/div/div/div/div[1]/ul/li")
    private WebElement errorMessage;


    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
