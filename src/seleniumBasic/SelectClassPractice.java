package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPractice {
	
	/*
	 Select Class-
	 
	 
	 1.Single Selection
	 2.Multiple Selection
	 
	 1.Single Selection
	 
	 selectByValue
	 selectByIndex
	 selectByVisibleText
	 
	 deselectByValue
	 deselectByIndex
	 deselectByVisibleText
	 
	 
	 */
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    selectOption();
	}
	
	
	static void selectOption() {
		WebElement menu=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(menu);
		
		s.selectByIndex(1);
		s.selectByValue("option3");
		s.selectByVisibleText("Option2");
		
	
		
	
		
		
	
	}
	
	

}
