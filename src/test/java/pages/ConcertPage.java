package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConcertPage extends BasePage {

    public ConcertPage(WebDriver driver) { super(driver); }

    private final String ALL_VENUES_BUTTON = "//*[@id='venue']";
    private final String VENUE_CHECKBOX = "//span[text()='%s']";
    private final String APPLY_BUTTON_IN_VENUE = "(//button[contains(@class, 'js-filter-apply-btn') and contains(text(), 'Apply')])[2]";
    private final String ALL_STYLES_BUTTON = "(//span[text()='All styles'])[1]";
    private final String STYLE_CHECKBOX = "//span[text()='%s']";
    private final String APPLY_BUTTON_IN_STYLES = "(//button[contains(@class, 'js-filter-apply-btn') and contains(text(), 'Apply')])[3]";
    private final String HIPHOP_STYLE = "//a[@href='/en/catalog/kyiv/all-categories/style=hip-hop']";
    private final String EVENTS = "//*[@id='event-list']/*[contains(@class,'event')]";
    private final String EVENTS_PLACE = "//span[@class='event__place']//span[@class='event__place']";

    public ConcertPage clickAllVenuesButton() {
        waitUntilElementToBeClickable(ALL_VENUES_BUTTON).click();
        return this;
    }

    public ConcertPage clickCheckboxInVenue(String venue) {
        String selectedVenue = String.format(VENUE_CHECKBOX, venue);
        scrollToElement(waitUntilVisibilityOfElement(selectedVenue));
        waitUntilElementToBeClickable(selectedVenue).click();
        return this;
    }

    public ConcertPage clickApplyButtonInVenue() {
        scrollToElement(waitUntilVisibilityOfElement(APPLY_BUTTON_IN_VENUE));
        waitUntilElementToBeClickable(APPLY_BUTTON_IN_VENUE).click();
        return this;
    }

    public ConcertPage clickAllStylesButton() {
        scrollToElement(waitUntilVisibilityOfElement(ALL_STYLES_BUTTON));
        waitUntilElementToBeClickable(ALL_STYLES_BUTTON).click();
        return this;
    }

    public ConcertPage clickCheckboxInStyles(String style) {
        String selectedStyle = String.format(STYLE_CHECKBOX, style);
        scrollToElement(waitUntilVisibilityOfElement(selectedStyle));
        waitUntilElementToBeClickable(selectedStyle).click();
        return this;
    }

    public ConcertPage clickApplyButtonInStyles() {
        scrollToElement(waitUntilVisibilityOfElement(APPLY_BUTTON_IN_STYLES));
        waitUntilElementToBeClickable(APPLY_BUTTON_IN_STYLES).click();
        return this;
    }

    public List<WebElement> getFilteredEvents() {
        return waitUntilVisibilityOfElementsLocated(EVENTS);
    }

    public WebElement getHipHopStyle () {
        return waitUntilVisibilityOfElement(HIPHOP_STYLE);
    }

    public List<WebElement> getEventsPlace () {
        return waitUntilVisibilityOfElementsLocated(EVENTS_PLACE);
    }
}
