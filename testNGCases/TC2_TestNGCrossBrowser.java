package testNGCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
 

public class TC2_TestNGCrossBrowser {
 
	WebDriver driver;
	
	@Test
    // Here this parameters we will take from testng.xml
    @Parameters("Browser")
    public void CrossBrowserTestCase(String browser) {
        if(browser.equalsIgnoreCase("FF")){
            System.setProperty("webdriver.gecko.driver", "C:\\Training software 64 bit\\geckodriver-v0.14.0-win64\\geckodriver.exe");
            // Start browser
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("http://www.facebook.com");
            driver.quit();
        }
        else if(browser.equalsIgnoreCase("IE")){
            String driverPath = "C:\\Examples\\SeleniumDrivers\\";
            System.out.println("launching IE browser");
            System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get("http://www.facebook.com");
            driver.quit();
        }
    }

}