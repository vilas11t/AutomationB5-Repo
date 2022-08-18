package Krutika;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLocators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		//Driver.get("https://testautomationpractice.blogspot.com/");
		
		//Driver.manage().window().maximize();
		
		//System.out.println(Driver.getWindowHandle());
		//System.out.println();
		//Driver.close();
		//System.out.println(Driver.getWindowHandles());
		
		
		//Guru.com Exercise
		Driver.get("https://www.demo.guru99.com/V4/");
		Driver.manage().window().maximize();
		Driver.findElement(By.name("uid")).sendKeys("mngr432703");
		Driver.findElement(By.name("password")).sendKeys("pAnaqAp");
		Driver.findElement(By.name("btnLogin")).click();
		
		
		
		//Driver.findElement(By.xpath());
		}

}
