package tushar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPractice3 {

	static WebDriver driver;
	static JavascriptExecutor js;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		js=(JavascriptExecutor) driver;
		
		//driver.get("https://www.amazon.in/b?node=15325111031&pf_rd_r=TJ4KHB6B17NJQCR9CMJQ&pf_rd_p=d870435b-a0b9-4b4c-a1a5-4feeaa98caed&pd_rd_r=7b43e84f-53e5-40d9-8bd2-434127c7c3c7&pd_rd_w=LP3cj&pd_rd_wg=7XbFU&ref_=pd_gw_unk");
	//	onclick() ;
	//	scroll();
		scrollbyElement();
	}
	
	static void onclick() {
		
		js.executeScript("arguments[0].click();",driver.findElement(By.id("nav-orders")));	
	}
	static void scroll() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
	static void scrollbyElement() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("mousehover")));
		
	}
}
