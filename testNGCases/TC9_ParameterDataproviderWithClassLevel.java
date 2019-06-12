package testNGCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC9_ParameterDataproviderWithClassLevel {
    WebDriver driver;    
    
 	@BeforeTest
    public void setup(){
 		 System.setProperty("webdriver.chrome.driver","C:\\Training software 64 bit\\chromedriver_win32\\chromedriver.exe");
  	  	 driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
   
    @Test(dataProvider="SearchProvider",dataProviderClass=DataproviderClass.class)
    public void testMethod(String author,String searchKey) throws InterruptedException{
        
        WebElement searchText = driver.findElement(By.name("q"));
        //Search text in google text box
        searchText.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        //get text from search box
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
        //verify if search box has correct value
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
   }
}