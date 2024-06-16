package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

public class TestInit {

    protected static WebDriver driver;

    private final String BASE_URL = "https://concert.ua/en";

    @BeforeMethod
    public void openDriveWithLogin() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeTest() {
        driver.quit();
    }

    public void navigateGoBack() {
        driver.navigate().back();
    }

    public void switchToTheNextWindow() {
        String originalWindowHandle = driver.getWindowHandle();

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
