package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.facebook.com/");

	   System.out.println(driver.getTitle()		

	driver.findElement(By.id("email")).sendKeys("tushar.cherphale@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		
		driver.findElement(By.name("login")).click();
	System.out.println(driver.findElement(By.cssSelector("div._9ay7")));
	
	driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']"));
	
		
		//driver.findElement(By.name("email")).sendKeys("tushar.cherphale@gmail.com");
		//driver.findElement(By.name("Password")).sendKeys("social@123");
		
		}
}
