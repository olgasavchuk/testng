package TestSetUps;
;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSetUp {

    public RemoteWebDriver driver;

    @Parameters({ "browser","platform","host","port" })
    @BeforeMethod
    public void setupBeforeMethod(String browser, String platform, String host, String port) throws MalformedURLException {
        String url = host + ":" + port + "/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();

        //Set up Browser
        if (browser.equals("firefox")) {
            cap = DesiredCapabilities.firefox();
        }
        if (browser.equals("chrome")) {
            cap = DesiredCapabilities.chrome();
        }

        //Set up Platform
        if (platform.equals("windows")) {
            cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
        }

        driver = new RemoteWebDriver(new URL(url), cap);
    }

    @AfterMethod
    public void setupAfterMethod(){
        driver.quit(); //TODO while running in parallel closes only the first instance
    }
}
