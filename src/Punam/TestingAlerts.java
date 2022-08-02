package Punam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingAlerts {
	static WebDriver wd;
	public static void main(String[] args) throws InterruptedException {
		SystemProperties.setProp();
		wd=new ChromeDriver();
		wd.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//simpleAlert();
		//Thread.sleep(2000);
		promptAlert();
	}
	private static void promptAlert() throws InterruptedException {
		// TODO Auto-generated method stub
		wd.findElement(By.id("confirmbtn")).click();
		wd.findElement(By.id("name")).sendKeys("Enter the name");
		Thread.sleep(2000);
		wd.switchTo().alert();
		
	}
	private static void simpleAlert() throws InterruptedException {
		// TODO Auto-generated method stub
		wd.findElement(By.id("alertbtn")).click();
		wd.switchTo().alert().accept();
		Thread.sleep(1000);
		wd.close();
	}
	
}
