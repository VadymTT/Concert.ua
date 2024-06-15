package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    public SignUpPage (WebDriver driver) { super(driver); }

    private final String NAME_FIELD = "//input[@placeholder='Your name']";
    private final String LAST_NAME_FIELD = "//input[@placeholder='Your lastname']";
    private final String EMAIL_FIELD = "//input[@placeholder='E-mail']";
    private final String ENTER_PASSWORD = "//input[@placeholder='Enter password']";
    private final String REPEAT_PASSWORD = "//input[@placeholder='Repeat password']";

    private final String NAME_ERROR_MESSAGE = "//span[text()='The Name field must contain only letters']";
    private final String LAST_NAME_ERROR_MESSAGE = "//span[text()='The Surname field must contain only letters']";
    private final String EMAIL_ERROR_MESSAGE = "//span[text()='Email is not a valid email address.']";
    private final String PASSWORD_ERROR_MESSAGE = "//span[contains(text(), 'minimum of 8 characters, including numbers, uppercase and lowercase letters')]";

    WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Your name']"));
    WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Your lastname']"));
    WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='E-mail']"));
    WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
    WebElement repeatPasswordField = driver.findElement(By.xpath("//input[@placeholder='Repeat password']"));

    public SignUpPage clickToNameField () {
        waitUntilElementToBeClickable(NAME_FIELD).click();
        return this;
    }

    public SignUpPage clickToLastNameField () {
        waitUntilElementToBeClickable(LAST_NAME_FIELD).click();
        return this;
    }

    public SignUpPage clickToEmailField () {
        waitUntilElementToBeClickable(EMAIL_FIELD).click();
        return this;
    }

    public SignUpPage clickToEnterPasswordField () {
        waitUntilElementToBeClickable(ENTER_PASSWORD).click();
        return this;
    }

    public SignUpPage clickToRepeatPasswordField () {
        waitUntilElementToBeClickable(REPEAT_PASSWORD).click();
        return this;
    }

    public void enterName (String userName) { nameField.sendKeys(userName); }


    public void enterLastName (String userLastName) {
        lastNameField.sendKeys(userLastName);
    }


    public void enterEmail (String email) {
        emailField.sendKeys(email);
    }


    public void enterPassword (String password) {
        passwordField.sendKeys(password);
    }


    public void enterPasswordRepeat (String repeatPass) {
        repeatPasswordField.sendKeys(repeatPass);
    }


    public WebElement getNameErrorMessage () {
        return waitUntilVisibilityOfElement(NAME_ERROR_MESSAGE);
    }

    public WebElement getLastNameErrorMessage () {
        return waitUntilVisibilityOfElement(LAST_NAME_ERROR_MESSAGE);
    }

    public WebElement getEmailErrorMessage () {
        return waitUntilVisibilityOfElement(EMAIL_ERROR_MESSAGE);
    }

    public WebElement getPasswordErrorMessage () {
        return waitUntilVisibilityOfElement(PASSWORD_ERROR_MESSAGE);
    }
}
