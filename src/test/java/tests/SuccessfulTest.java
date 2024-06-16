package tests;

import base.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcertPage;
import pages.HomePage;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SuccessfulTest extends TestInit {

    @Test
    public void CheckTheFilteringFunction() {
        HomePage homePage = new HomePage(driver);
        ConcertPage concertPage = new ConcertPage(driver);

        homePage.clickChooseCityButton();
        homePage.chooseCity("Kyiv");
        homePage.clickCloseWindowIcon();

        homePage.clickConcertsButton();

        concertPage.clickAllVenuesButton();
        concertPage.clickCheckboxInVenue("V’YAVA");
        concertPage.clickApplyButtonInVenue();

        concertPage.clickAllStylesButton();
        concertPage.clickCheckboxInStyles("Hip-Hop");
        concertPage.clickApplyButtonInStyles();

        List<WebElement> filteredEventsByStyle = concertPage.getFilteredEvents();

        for (int i = 0; i < filteredEventsByStyle.size(); i++ ) {

            filteredEventsByStyle.get(i).click();

            Assert.assertTrue(concertPage.getHipHopStyle().isDisplayed());
            concertPage.navigateBack();
        }

        List <WebElement> filteredEventsByVenue = concertPage.getEventsPlace();
        Set<String> uniqueEvents = filteredEventsByVenue.stream()
                .map(WebElement::getText).map(String::trim).collect(Collectors.toSet());

        Assert.assertEquals(uniqueEvents.size(), 1);
        Assert.assertTrue(uniqueEvents.contains("Kyiv, V’YAVA"));
    }
}
