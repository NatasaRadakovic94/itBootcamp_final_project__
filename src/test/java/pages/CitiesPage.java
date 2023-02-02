package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiesPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/main/div/div[2]/div/div[1]/div[1]/div[3]/form/div[1]/button")
    private WebElement newItemButton;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"app\"]/div[5]/div/div/div[3]/button[2]")
    private WebElement saveButton;

    public CitiesPage(WebDriver driver, WebDriverWait driverWait){
        super(driver, driverWait);
    }
    public void clickNewItemButton(){
        newItemButton.click();
    }
    public void enterCityName(String cityName){
        nameInput.sendKeys(cityName);
    }
    public void clickSaveButton(String cityName){
        saveButton.click();
    }

}
