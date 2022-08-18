package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumBasic.BaseClass;

public class DataProviderPractice1 extends BaseClass{
	public WebDriver driver;
	@BeforeClass
	void beforeClass()
	{
		driver=driverInitialize();
	}
	@Test(dataProvider ="logindata")
	void LoginTest(String username,String password)
	{
		String ExpectedErrorMessage="The password that you've entered is incorrect. Forgotten password?";
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.id("pass")).sendKeys("password1");
		driver.findElement(By.xpath("//*[@class='_xkt'and@id='loginbutton']")).click();
		String ActualMessage=driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
	}
		
		@DataProvider(name="logindata")
		Object[][]loginTestData()
				{
			return new Object[][] {{"username1","password1"},{"username2","password2"},{"username3","password3"}};
			
		}
		
	
	@AfterClass
	void afterclass()
	{
		//driver.close();
	}


}


