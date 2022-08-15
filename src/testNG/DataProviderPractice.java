package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumBasic.BaseClass;

public class DataProviderPractice extends BaseClass {
	
	// DataProvider- 
	// annotation - it used to provide test data.
	  // dataProvider annotated method returs- Object[][]
	
	// Assert - used for verification it is class in tesrtNG
	  // 2 types
	 // 1. Hard assert - if assert fails test case will not execute rest of code and test case will fails.
	
	 // 2 soft assert- if assert fails rest of code will execute. 
	// 
	
	
	public WebDriver driver;
	@BeforeClass
	void beforeClass() {
		driver=driverInitialize();
	}
	
	@Test(dataProvider="loginData")
	void LoginTestCase(String userName,String password) {
		String expectederrorMessage="Temporary error occured[#5001], please try again.";
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.id("login1")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
		String actualErrorMessage=driver.findElement(By.xpath("//div[@id='div_login_error']//b")).getText();
		Assert.assertEquals(actualErrorMessage, expectederrorMessage,"expected error message not matches with actual");
		System.out.println("Rest of code");
	}
	
	@DataProvider(name="loginData")
	Object[][] loginTestData() {
		return new Object[][] {{"userName1","Password1"},{"userName2","Password2"}, {"userName3","Password3"}};
	}
	
	
	
	
	@AfterClass
	void afterClass() {
		//driver.close();
		
	}
	
	 

}
