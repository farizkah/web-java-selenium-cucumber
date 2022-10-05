package automation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchHotelPage extends BasePage{

    WebDriver driver;
    WebDriverWait wait;
    private By locationField = By.xpath("//input[@data-testid='autocomplete-field']");
    private By lastSearchLabel = By.xpath("//input[@data-testid='autocomplete-last-search']");
    private By locationLabel = By.xpath("//div[@data-testid='autocomplete-item-name']");

    public SearchHotelPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void visitWebpage(){
        driver.get("https://www.traveloka.com/en-id/hotel");
    }

    public void searchLocation(String location){
        driver.findElement(locationField).click();
        driver.findElement(locationField).sendKeys(location);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(lastSearchLabel));
        driver.findElement(locationLabel).click();
    }

}
