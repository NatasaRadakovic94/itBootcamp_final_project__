package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected Faker faker;
    protected String url = "https://vue-demo.daniel-avellaneda.com/";

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\bootcamp\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, driverWait);
        loginPage = new LoginPage(driver, driverWait);
        driver.manage().window().maximize();
        faker = new Faker();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.get(url);
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    public void logIn() throws InterruptedException {
        homePage.clickLoginButton();
        //Thread.sleep(2000);
        loginPage.getEmailInput().sendKeys("admin@admin.com");
        loginPage.getPasswordInput().sendKeys("12345");
        loginPage.clickLoginButton();
        Thread.sleep(2000);
    }
}

