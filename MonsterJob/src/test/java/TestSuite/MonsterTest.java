package TestSuite;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class MonsterTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	  }
	
	
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
  }
  

}
