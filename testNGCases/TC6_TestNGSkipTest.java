package testNGCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
//You can skip any test by using “enabled=false” parameter.
public class TC6_TestNGSkipTest {
	@Test(priority = 0)
	public void firstTest () {
	    System.out.println("1st Test is Started.");
	}
	 
	@Test (priority = 1, enabled = false)
	public void secondTest () {
	    System.out.println("2nd Test is Started.");
	}
	 
	@Test (priority = 2)
	public void thirdTest () {
	    System.out.println("3rd Test is Started.");
	}
}