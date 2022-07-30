package tushar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	static WebDriver driver;
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		//mouseOver();
		mousehover();// method call to visit the amazon website.
}
	static void mouseOver()  {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	driver.manage().window().maximize();
	WebElement mouseover=driver.findElement(By.id("mousehover"));
	
	Actions action =new Actions(driver);
	action.moveToElement(mouseover).build().perform();
	}
	
	static void mousehover() {
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=8996620686666591927&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20462&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAjwrZOXBhACEiwA0EoRD_dMm7T7I9uo7Hq3AqV7aQ_e3_etAWaxy-m9dOK_3vSOU-rci6HzFhoCQ04QAvD_BwE");
		
		WebElement mouse=driver.findElement(By.className("icp-nav-link-inner"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(mouse).build().perform();
	}
}
