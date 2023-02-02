package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div[5]/button")
    private WebElement signupButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/ul/li")
    private WebElement existingEmailError;

    public SignupPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }
    public WebElement getConfirmPasswordInput(){
        return confirmPasswordInput;
    }
    public WebElement getExistingEmailError(){
        return existingEmailError;
    }
    public void clickSignupButton(){
        signupButton.click();
    }














    /*public WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public WebElement getExistingEmailError() {
        return existingEmailError;
    }

    public void clickSignupButton() {
        signupButton.click();
    }*/
}
