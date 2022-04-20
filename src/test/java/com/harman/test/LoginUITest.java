package com.harman.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.harman.base.WebDriverWrapper;

/*public class LoginUITest {
	
WebDriverManager driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.get("https://demo.openemr.io/b/openemr");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	public void validateTitleTest() {
		 String actualTitle= ((WebDriver) driver).getTitle();
		 Assert.assertEquals(actualTitle, "OpenEMR");
	}

}*/
public class LoginUITest extends WebDriverWrapper {
	
	@Test
	public void validateTitleTest()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}
	
}

