package automation.pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    private final String urlHomepage = "https://traveloka.com";

    public WebDriver getDriver() {
        return driver;
    }

//    public void setDriver(WebDriver driver) {
//        this.driver = driver;
//    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
