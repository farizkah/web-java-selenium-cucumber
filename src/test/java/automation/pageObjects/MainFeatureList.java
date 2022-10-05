package automation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainFeatureList {

    private WebDriver driver;
    private By hotelText = By.xpath("//div[text()='Hotels']");

    public MainFeatureList(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param feature Traveloka feature in homepage (Hotels, Xperience, etx)
     */
    public void openFeature(String feature){
        driver.findElement(By.xpath("//div[text()='"+ feature +"'s]")).click();
    }
}
