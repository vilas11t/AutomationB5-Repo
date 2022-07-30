package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
	
	/*
	 Alerts
	 1. Simple  - accept 
	 2.Confirmation- accept/reject
	 3. Prompt Alert- enter text and then accept or reject
	 
	 driver.switchTo().Alerts(). - Accept(), Dismiss(), sendKeys("Text"), getText();
	 
	 
	 */
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//simpleAlert();
		confirmationAlert();
	}
	
	static void simpleAlert() {
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.close();
	}
	static void confirmationAlert() {
		driver.findElement(By.id("name")).sendKeys("Rahul");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
	}

}
