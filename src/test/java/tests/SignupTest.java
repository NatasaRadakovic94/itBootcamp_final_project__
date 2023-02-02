package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest{
    private SignupPage signupPage;
    private Faker faker;

    @BeforeClass
    @Override
    public void beforeClass() throws InterruptedException {
        super.beforeClass();
        signupPage = new SignupPage(driver, driverWait);
    }
        @Test
        public void checkSignupRoute() throws InterruptedException {
            Thread.sleep(1000);
            homePage.clickSignupButton();
            Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
        }
        @Test
        public void checkInputTypes(){
        homePage.clickSignupButton();
        Assert.assertEquals(signupPage.getEmailInput().getAttribute("type"), "email");
        Assert.assertEquals(signupPage.getPasswordInput().getAttribute("type"), "password");
        Assert.assertEquals(signupPage.getConfirmPasswordInput().getAttribute("type"), "password");
        }

        @Test
        public void checkErrorIfUserExists() throws InterruptedException {
        homePage.clickSignupButton();

        signupPage.getNameInput().sendKeys("Test Test");
        signupPage.getEmailInput().sendKeys("admin@admin.com");
        signupPage.getPasswordInput().sendKeys("123654");
        signupPage.getConfirmPasswordInput().sendKeys("123654");
        signupPage.clickSignupButton();
        Thread.sleep(2000);
        Assert.assertEquals(signupPage.getExistingEmailError().getText(), "E-mail already exists");
        Assert.assertTrue(driver.getCurrentUrl().contains("/signup"));
        }

        @Test
    public void checkSignup() throws InterruptedException {
        String name = "Natasa Radakovic";
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        homePage.clickSignupButton();
        Thread.sleep(2000);
        signupPage.getNameInput().sendKeys(name);
        signupPage.getEmailInput().sendKeys(email);
        signupPage.getConfirmPasswordInput().sendKeys(password);
        signupPage.clickSignupButton();
        }


    }
