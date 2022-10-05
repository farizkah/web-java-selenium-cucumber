package automation.stepDefinitions;

import automation.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    DriverFactory driverFactory;
    WebDriver driver;

    @Before
    public void launchBrowser(){
        driverFactory = new DriverFactory();
        driver = driverFactory.initDriver("chrome");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
