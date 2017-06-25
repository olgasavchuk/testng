package SmokeTests;

import TestSetUps.TestSetUp;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest  extends TestSetUp {

    @Parameters({ "url" })
    @Test(groups = {"smokeTest" , "login"})
    public void loginPositive5(String url) {
        getDriver().navigate().to(url);
        System.out.println("Test finished");
    }

    @Parameters({ "url" })
    @Test(groups = {"smokeTest" , "login"})
    public void loginPositive1(String url) {
        getDriver().navigate().to(url);
        System.out.println("Test finished");
    }

    @Parameters({ "url" })
    @Test(groups = {"smokeTest" , "login"})
    public void loginPositive2(String url) {
        getDriver().navigate().to(url);
        System.out.println("Test finished");
    }

    @Parameters({ "url" })
    @Test(groups = {"smokeTest" , "login"})
    public void loginPositive3(String url) {
        getDriver().navigate().to(url);
        System.out.println("Test finished");
    }

    @Parameters({ "url" })
    @Test(groups = {"smokeTest" , "login"})
    public void loginPositive4(String url) {
        getDriver().navigate().to(url);
        System.out.println("Test finished");
    }
}
