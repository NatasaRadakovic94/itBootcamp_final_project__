package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class ProfileTest extends BaseTest{
    ProfilePage profilePage;
    @BeforeClass
    @Override
    public void beforeClass() throws InterruptedException {
        super.beforeClass();
        loginPage = new LoginPage(driver, driverWait);
        profilePage = new ProfilePage(driver, driverWait);
    }

    @Test
    public void checkEditProfile() throws InterruptedException {
        String name = faker.name().name();
        String phone = faker.phoneNumber().phoneNumber();
        String country = faker.address().country();
        String twitter = faker.internet().domainName();
        String github = faker.internet().domainName();

        logIn();
        homePage.clickMyProfileButton();
        Thread.sleep(1000);
        profilePage.insertName(name);
        profilePage.insertPhone(phone);
        profilePage.insertCountry(country);
        profilePage.insertTwitter("https://www." + twitter);
        profilePage.insertGithub("https://www." + github);
        Thread.sleep(2000);
        profilePage.clickSaveButton();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        Assert.assertEquals(profilePage.getNameInput().getAttribute("value"), name);
        Assert.assertEquals(profilePage.getPhoneInput().getAttribute("value"), phone);
        Assert.assertEquals(profilePage.getCountryInput().getAttribute("value"), country);
        Assert.assertEquals(profilePage.getTwitterInput().getAttribute("value"), "https://www."+twitter);
        Assert.assertEquals(profilePage.getGithubInput().getAttribute("value"), "https://www."+github);
    }
}