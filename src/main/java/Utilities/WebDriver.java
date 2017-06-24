//package Utilities;
//
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WebDriver {
//    private WebDriver driver;
//    private static WebDriver instance;
//
//    private WebDriver()
//    {
//    }
//
//    //Singleton pattern implementation
//    public static WebDriver GetInstance()
//    {
//        return (instance ?? (instance = new WebDriver()));
//    }
//
//    public WebDriver GetDriver()
//    {
//        return (driver ?? (driver = OpenBrowser(ConfigurationManager.AppSettings["browser"])));
//    }
//
//    private WebDriver OpenBrowser(String browserName) throws NotImplementedException {
//        switch (browserName)
//        {
//            case "Chrome":
//                System.setProperty("webdriver.chrome.driver", "/Users/olga_savchuk/Projects/JAVA/orion-selenide/orion-selenide/chromedriver");
//                driver = new ChromeDriver();
//                break;
//            default:
//                throw new NotImplementedException();
//        }
//        //driver.Manage().Window.Size = new Size(1400, 900);
//        return driver;
//    }
//
//    public void ClearDriver()
//    {
//        if (driver != null)
//        {
//            driver.close();
//            driver = null;
//        }
//    }
//}
