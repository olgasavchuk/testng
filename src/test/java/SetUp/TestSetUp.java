package test.java.SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.net.URL;

public class TestSetUp {

    protected ThreadLocal<RemoteWebDriver> driver = null;

    @BeforeMethod
    @Parameters({ "browser","platform","host","port" })
    public void setupBeforeMethod(String browser, String platform, String host, String port) throws Exception {
        String url = host + ":" + port + "/wd/hub";

        driver = new ThreadLocal<RemoteWebDriver>();

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

        int attempts = 30;
        while(true) {
            try {
                driver.set(new RemoteWebDriver(new URL(url), cap));
                System.out.println(browser + " is started");
                break;
            } catch(Exception e) {
                attempts--;
                Thread.sleep(1000);
                if (attempts < 0) throw e;
            }
        }
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void setupAfterMethod(){
        getDriver().quit();
    }
}

