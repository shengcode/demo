package testNGCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
//You can skip any test by using “enabled=false” parameter.
public class TC7_TestNGDataProvider {
	@DataProvider (name = "LoginData")
	public static Object[][] loginData () {
	    //Userdata is formatted as username and password
	    return new Object[][] { { "user1", "pass1" }, { "user2", "pass2" }};
	}
	@Test (dataProvider = "LoginData")
	public void dataProviderTest (String username, String password) {
	    System.out.println("Test is Started...");	 
	    System.out.println("Username: " + username);
	    System.out.println("Password: " + password );
	}
}