package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice {
	
	 /*
	 1. JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver. 
	 
	 2. JavaScriptExecutor provides two methods “executescript” & “executeAsyncScript” 
	 to run javascript on the selected window or current page.
	 
	 
	 Basic Syntax
	 JavascriptExecutor js = (JavascriptExecutor) driver;  
     js.executeScript(Script,Arguments);
     
     Script – This is the JavaScript that needs to execute.
     Arguments – It is the arguments to the script. It’s optional.
	 
	 The script can return values. Data types returned are
    Boolean
	Long
	String
	List
	WebElement.
	
	
	Some common Operations Using JS
	
	1. Click on webelement
	  js.executeScript("arguments[0].click();", button);
	  
	2. To send text on webelement
      js.executeScript("document.getElementById('some id').value='someValue';");
      
    3.to scroll down to the bottom of a webpage.
      js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
      
    4.Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
        
    5. To generate Alert
       js.executeScript("alert('enter correct login credentials to continue');");
       
    6. This will scroll the page till the element is found- vertically / Horizontally		
        js.executeScript("arguments[0].scrollIntoView();", Element);
	 */
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		js=(JavascriptExecutor)driver;
		scrollByJss();
		scrollByPixel();
		scrollintoWebElement();
		driver.close();
	}
	
	static void clickByJs() {
		js.executeScript("arguments[0].click()", driver.findElement(By.id("signupModalButton")));
	}

	static void scrollByJss() {
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	static void scrollByPixel() {
		js.executeScript("window.scrollBy(0,700)");
	}
	
	static void scrollintoWebElement() {
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//a[text()='Contact Us']")));
	}
	
}
