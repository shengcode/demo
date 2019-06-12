package testNGCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1_FirstNGCase {
	
  @Test(groups={"g1","g2"})
  @Parameters("Countries")
  public void f1(String country) {
	  System.out.println("Test Case1:"+country);
  }
  
  @Test(groups={"g2"})
  public void f2() {
	  System.out.println("Test Case2");
  }
  
  @Test(groups={"g1"})
  public void f3() {
	  System.out.println("Test Case3");
  }
  
  @Test
  public void f4() {
	  System.out.println("Test Case4");
  }
}
