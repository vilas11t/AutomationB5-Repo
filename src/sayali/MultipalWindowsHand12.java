package sayali;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipalWindowsHand12 {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		switchToWindow();
	}
	
	
	static void switchToWindow() throws InterruptedException {
		String title="QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy";
		
		String HomePageId=driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		
		Thread.sleep(2000);
		
		Set<String> windowIds= driver.getWindowHandles();
		
		for(String id:windowIds) {   
			
			
			if(!HomePageId.equals(id)) {
				driver.switchTo().window(id);
			}
		
		}
		
		System.out.println("New Page Title:"+driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(HomePageId);
		System.out.println("Home Page Title:"+driver.getTitle());
		driver.close();
		
		
	
		
	}


}


                                       
