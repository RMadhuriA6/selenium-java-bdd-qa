package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void createDriver() {
        driver = new ChromeDriver();
    }

    @After
    public void killDriver(){
        driver.quit();
    }
}
