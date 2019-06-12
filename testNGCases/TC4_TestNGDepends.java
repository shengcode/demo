package testNGCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 

public class TC4_TestNGDepends {
	@Test(dependsOnMethods = {"openWebsite"})
	public void loginWebsite () {
	    System.out.println("Logged-in website!");
	}
	 
	@Test
	public void openWebsite () {
	    System.out.println("Website opened!");
	}
	 
	@Test (dependsOnMethods = {"loginWebsite"})
	public void goToBasket () {
	    System.out.println("We are in basket!");
	}
	 
	@Test (dependsOnMethods = {"goToBasket"})
	public void logOutFromWebsite () {
	    System.out.println("Logged-out from website!");
	}
}