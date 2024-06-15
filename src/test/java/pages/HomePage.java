package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage  {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String CHOOSE_CITY_BUTTON = "(//span[text()='Choose city'])[1]";
    private final String CITY_BUTTON = "//b[text()='%s']";
    private final String CONCERTS_BUTTON = "//a[@class='main-menu__item' and text()='Concerts']";
    private final String CLOSE_WINDOW_ICON = "//button[@class='popup-close-btn js-popup-close']";
    private final String SIGN_IN_BUTTON = "//a[@class='choose-location-link__text ' and text()='Sign in']";

    public HomePage clickChooseCityButton() {
        waitUntilElementToBeClickable(CHOOSE_CITY_BUTTON).click();
        return this;
    }

    public HomePage chooseCity(String cityName) {
        waitUntilElementToBeClickable(String.format(CITY_BUTTON, cityName)).click();
        return this;
    }

    public HomePage clickConcertsButton() {
        waitUntilElementToBeClickable(CONCERTS_BUTTON).click();
        return this;
    }


    public HomePage clickCloseWindowIcon() {
        waitUntilElementToBeClickable(CLOSE_WINDOW_ICON).click();
        return this;
    }


    public HomePage clickSignInButton (){
        waitUntilElementToBeClickable(SIGN_IN_BUTTON).click();
        return this;
    }


}
