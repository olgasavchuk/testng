package test.java.SmokeTests;

import org.testng.annotations.*;
import test.java.SetUp.TestSetUp;

public class LoginTest extends TestSetUp {

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
