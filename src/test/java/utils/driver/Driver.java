package utils.driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    public static WebDriver webDriver;
    public static WebDriverWait webDriverWait;

    @BeforeScenario
    public void setUp() throws Exception {
        webDriver = DriverFactory.getDriver();
    }

    @AfterScenario
    public void tearDown() {
        webDriver.quit();
    }

}
