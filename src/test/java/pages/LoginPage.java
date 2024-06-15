package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) { super(driver); }

    private final String SIGN_UP_BUTTON = "//a[@href='/en/login/sign-up']";


    public LoginPage clickSignUpButton () {
        waitUntilElementToBeClickable(SIGN_UP_BUTTON).click();
        return this;
    }
}
