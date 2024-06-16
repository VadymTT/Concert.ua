package tests;

import base.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class NegativeTest extends TestInit {

    @Test
    public void checkSuccessOfErrorMassages() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        homePage.clickSignInButton();

        loginPage.clickSignUpButton();

        signUpPage.enterName("2");
        signUpPage.enterLastName("2");
        signUpPage.enterEmail("testemailgmail.com");
        signUpPage.enterPassword("testing11111");
        signUpPage.enterPasswordRepeat("testing1111");

        Assert.assertTrue(signUpPage.getNameErrorMessage().isDisplayed());
        Assert.assertTrue(signUpPage.getLastNameErrorMessage().isDisplayed());
        Assert.assertTrue(signUpPage.getEmailErrorMessage().isDisplayed());
        Assert.assertTrue(signUpPage.getPasswordErrorMessage().isDisplayed());


    }
}
