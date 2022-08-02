package seleniumBasic;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {
	/*
	 Wait-

	    1. implicit wait
	    2. explicit wait
	    3. fluent wait
	    
	    
	   1.  implicit wait
	         - it tells webdriver to wait for certain amount of time before throwing an NoSuchElement Exception.
	         - this wait applied with webdriver.
	 
	   2. explicit wait 
	         it tells webdriver to wait for some expected condition or max timeout before throwing an NoSuchElement exception
	   
	   3. Fluent wait
	       it tells webdriver to wait for some expected condition or max timeout before throwing an VisibilityOfElementLocated exception.
	       it checks for condition periodically with some frequency. (polling)
	       
	 */
	
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		implitWait();
		explicitWait();
		fluentWait();
		driver.quit();
	}
	
	static void implitWait() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@title='Online Shopping']")).click();
		driver.findElement(By.xpath("//a[text()='Bags and Luggage']")).click();
	}
	
	static void explicitWait() {
		driver.get("https://www.rediff.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		
		WebElement onlineShopping=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Online Shopping']"))));
		onlineShopping.click();
		
		WebElement bagsSection=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Bags and Luggage']"))));
		bagsSection.click();
			
	}
	
	static void fluentWait() {
		driver.get("https://www.rediff.com/");
		Wait wait =new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//a[@title='Online Shopping']")).click();
	}

}
