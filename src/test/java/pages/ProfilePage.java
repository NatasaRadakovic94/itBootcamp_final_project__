package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{  @FindBy(xpath = "//input[@name='name']")
WebElement nameInput;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement phoneInput;

    @FindBy(xpath = "//input[@name='city']")
    WebElement cityInput;
    @FindBy(xpath = "//*[@id=\"list-item-180-0\"]")
    WebElement chicagoInput;

    @FindBy(xpath = "//input[@name='country']")
    WebElement countryInput;

    @FindBy(xpath = "//input[@name='urlTwitter']")
    WebElement twitterInput;

    @FindBy(xpath = "//input[@name='urlGitHub']")
    WebElement githubInput;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div/div[2]/span/form/div/div/div[8]/button")
    WebElement saveButton;

    public ProfilePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void insertName(String name) {
        nameInput.sendKeys(Keys.CONTROL + "a");
        nameInput.sendKeys(Keys.DELETE);
        nameInput.sendKeys(name);
    }

    public void insertPhone(String phone) {
        phoneInput.sendKeys(Keys.CONTROL + "a");
        phoneInput.sendKeys(Keys.DELETE);
        phoneInput.sendKeys(phone);
    }

    public void insertCountry(String country) {
        countryInput.sendKeys(Keys.CONTROL + "a");
        countryInput.sendKeys(Keys.DELETE);
        countryInput.sendKeys(country);
    }

    public void insertTwitter(String twitter) {
        twitterInput.sendKeys(Keys.CONTROL + "a");
        twitterInput.sendKeys(Keys.DELETE);
        twitterInput.sendKeys(twitter);
    }

    public void insertGithub(String github) {
        githubInput.sendKeys(Keys.CONTROL + "a");
        githubInput.sendKeys(Keys.DELETE);
        githubInput.sendKeys(github);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public void clickChicagoOption() {
        chicagoInput.click();
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getChicagoInput() {
        return chicagoInput;
    }

    public WebElement getCountryInput() {
        return countryInput;
    }

    public WebElement getTwitterInput() {
        return twitterInput;
    }

    public WebElement getGithubInput() {
        return githubInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }


}

