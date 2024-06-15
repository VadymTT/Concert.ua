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

        signUpPage.clickToNameField();
        signUpPage.enterName("2");

        signUpPage.clickToLastNameField();
        signUpPage.enterLastName("2");

        signUpPage.clickToEmailField();
        signUpPage.enterEmail("testemailgmail.com");

        signUpPage.clickToEmailField();
        signUpPage.enterPassword("testing11111");

        signUpPage.clickToRepeatPasswordField();
        signUpPage.enterPasswordRepeat("testing1111");

        Assert.assertTrue(signUpPage.getNameErrorMessage().isDisplayed());
        Assert.assertTrue(signUpPage.getLastNameErrorMessage().isDisplayed());
        Assert.assertTrue(signUpPage.getEmailErrorMessage().isDisplayed());
        Assert.assertTrue(signUpPage.getPasswordErrorMessage().isDisplayed());


    }
}
