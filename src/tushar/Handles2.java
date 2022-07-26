package tushar;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	switchToTab();	
}
	static void switchToTab() throws InterruptedException {
	String Homepageid=driver.getWindowHandle();
	driver.findElement(By.id("opentab")).click();
	Thread.sleep(2000);
	
	Set<String>Windowid=driver.getWindowHandles();
	
	for(String id:Windowid) {
		if(!Homepageid.equals(id)) {
			driver.switchTo().window(id);	
		}
	}
	System.out.println("new page:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(Homepageid);
		System.out.println("homepage"+driver.getTitle());
		driver.close();
		
	}
		
}

