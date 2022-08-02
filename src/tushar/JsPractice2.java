package tushar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPractice2 {

	static WebDriver driver;
	static JavascriptExecutor js;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		js=(JavascriptExecutor) driver;
		
		driver.get("https://www.facebook.com/");
		sendtext();
		alert();
		
	}
	static void sendtext() {
		
		js.executeScript("document.getElementById('email').value='abc@gmail.com';");
		js.executeScript("document.getElementById('pass').value='123';");
		
		String text= (String)js.executeScript("return document.getElementById('email').value='abc@gmail.com';");
		System.out.println(text);
		
	}
	
	static void alert() {
		js.executeScript("alert('enter the corrct login credentail');");
		
	}
	
	
	
}
