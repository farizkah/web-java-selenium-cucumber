package automation.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchHotelPage extends BasePage{

    WebDriver driver;
    WebDriverWait wait;
    private final By locationField = By.xpath("//input[@data-testid='autocomplete-field']");
    private final By locationLabel = By.xpath("//div[@data-testid='autocomplete-item-name']//ancestor::mark");
    private final By dateField = By.xpath("//div[@data-testid='date-cell-15-11-2022']");
    private final By checkinField = By.xpath("//input[@data-testid='check-in-date-field']");
    private final By durationField = By.xpath("//div[@data-testid='dropdown-menu-item']");
    private final By occupancyField = By.xpath("//input[@data-testid='occupancy-field']");
    private final By stepperField = By.xpath("//div[@data-testid='stepper-value']");
    private final By addButton = By.xpath("//div[@data-testid='stepper-plus']");
    private final By occupancyDoneButton = By.xpath("//div[@data-testid='occupancy-done-btn']");
    private final By searchSubmitButton = By.xpath("//div[@data-testid='search-submit-button']");
    private final By searchResultLabel = By.xpath("//h2[@data-testid='tvat-searchResultTitle']");

    public SearchHotelPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
    }

    public void visitWebpage(){
        driver.get("https://www.traveloka.com/en-id/hotel");
    }

    public void searchLocation(String locationName){
        driver.findElement(locationField).click();
        driver.findElement(locationField).sendKeys(locationName);

        wait.until(ExpectedConditions.visibilityOfElementLocated(locationLabel));
        driver.findElement(locationLabel).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locationLabel));
    }

    public void setCheckInDateNextMonth(String date){
        driver.findElement(checkinField).click();
        driver.findElement(dateField).click();
    }

    public void setStayDuration(String night){
        wait.until(ExpectedConditions.visibilityOfElementLocated(durationField));
        driver.findElements(durationField).get(1).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(durationField));
    }

    public void setOccupancy(String childNumber){
        driver.findElement(occupancyField).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(addButton));
        for (int i=1; i<=Integer.parseInt(childNumber); i++) {
            driver.findElements(addButton).get(1).click();
            wait.until(ExpectedConditions.textToBePresentInElement(
                    driver.findElements(stepperField).get(1), Integer.toString(i)));
        }
        driver.findElement(occupancyDoneButton).click();
    }

    public void searchHotel(){
        driver.findElement(searchSubmitButton).click();
    }

    public void validateSearchResult(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultLabel));
    }
}
