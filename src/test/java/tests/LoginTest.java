package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    private LoginPage loginPage;
    private Faker faker;

    @BeforeClass
    @Override
    public void beforeClass() throws InterruptedException {
        super.beforeClass();
        loginPage = new LoginPage(driver, driverWait);
        faker = new Faker();
    }

    @Test
    public void checkUrlRoute() throws InterruptedException {
        homePage.clickLoginButton();
        Thread.sleep(1000); // ne radi bez ove linije
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    @Test
    public void checkInputTypes() throws InterruptedException {
        homePage.clickLoginButton();
        Thread.sleep(1000); // ne radi bez ove linije
        Assert.assertEquals(loginPage.getEmailInput().getAttribute("type"), "email");
        Assert.assertEquals(loginPage.getPasswordInput().getAttribute("type"), "password");
    }

    @Test
    public void checkUserNotExistsError() throws InterruptedException {
        homePage.clickLoginButton();
        Thread.sleep(2000); // ne radi bez ove linije
        loginPage.getEmailInput().sendKeys(faker.internet().emailAddress());
        loginPage.getPasswordInput().sendKeys(faker.internet().password());
        loginPage.clickLoginButton();
        Thread.sleep(2000); // ne radi bez ove linije
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "User does not exists");
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    @Test
    public void checkWrongPasswordError() throws InterruptedException {
        homePage.clickLoginButton();
        Thread.sleep(2000); // ne radi bez ove linije
        loginPage.getEmailInput().sendKeys("admin@admin.com");
        loginPage.getPasswordInput().sendKeys(faker.internet().password());
        loginPage.clickLoginButton();
        Thread.sleep(2000); // ne radi bez ove linije
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "Wrong password");
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    @Test
    public void checkProperLogin() throws InterruptedException {
        homePage.clickLoginButton();
        Thread.sleep(1000); // ne radi bez ove linije
        loginPage.getEmailInput().sendKeys("admin@admin.com");
        loginPage.getPasswordInput().sendKeys("12345");
        loginPage.clickLoginButton();
        Thread.sleep(2000); // ne radi bez ove linije
        Assert.assertTrue(driver.getCurrentUrl().contains("/home"));
        homePage.clickLogoutButton();
    }

    @Test
    public void checkLogOut() throws InterruptedException {
        homePage.clickLoginButton();
        Thread.sleep(1000); // ne radi bez ove linije
        loginPage.getEmailInput().sendKeys("admin@admin.com");
        loginPage.getPasswordInput().sendKeys("12345");
        loginPage.clickLoginButton();
        Thread.sleep(2000); // ne radi bez ove linije
        Assert.assertTrue(homePage.getLogOutButton().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("/home"));
        homePage.clickLogoutButton();
    }
}
