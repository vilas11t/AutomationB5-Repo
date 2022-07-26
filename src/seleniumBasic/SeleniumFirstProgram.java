package seleniumBasic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {
	//1. Selenium Jar files
	//2. drivers for webbrowser
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// to open url
		
		driver.get("https://www.google.com/");
		
		// maximize window
		driver.manage().window().maximize();
		
		Dimension d=new Dimension(900, 400);
		//driver.manage().window().setSize(d);
		
		
		
		// returns current url in the form of string
		System.out.println("Current url:"+driver.getCurrentUrl());
		
		
		// to get title of webpage
		
		System.out.println("Title:"+driver.getTitle());
		
		
		// to get all html code
		//System.out.println(driver.getPageSource());
		
		 System.out.println("Window id:"+driver.getWindowHandle());
		
		
		// to get all open window/tab ids
		   System.out.println("Window Ids:"+driver.getWindowHandles());
		  
		   // Navigate
		 driver.navigate().to("https://www.rediff.com/");  
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		    
		
		// to close current pointed window
			driver.close();
			
			//to close all opened windows and tabs
			//driver.quit();
		
	}

}
