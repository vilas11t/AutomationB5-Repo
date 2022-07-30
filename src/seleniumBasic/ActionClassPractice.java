package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	/*
	 Action-Interface
	 Actions- Class
	 
	 to handle mouse and keyboard events
	  
	  Mouse- 
	  click
	  rightclick-contextClick
	  mouserhover
	  doubleClick
	  dragAndDrop
	  clickAndHold
	  
	  keyboard
	  keypress/ keydown
	  keyup / keyrelease
	  sendkeys- input text
	  multiple keydown/release
	  caps typing
	  
	  
	  
	  Mouse Actions in Selenium:
	    Click();
		doubleClick(): Performs double click on the element
		clickAndHold(): Performs long click on the mouse without releasing it
		dragAndDrop(): Drags the element from one point and drops to another
		moveToElement(): Shifts the mouse pointer to the center of the element
		contextClick(): Performs right-click on the mouse
		
	
		
		
		Keyboard Actions in Selenium:
		sendKeys(): Sends a series of keys to the element
		keyUp(): Performs key release
		keyDown(): Performs keypress without release
		*/
	  
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//capsTyping();	
		//dragAndDrop();
		mouseHoverPractice();
	}
	
	static void capsTyping() {
		driver.get("https://www.google.com/");
		WebElement googleSeachBox=driver.findElement(By.xpath("//input[@title='Search']"));
		Actions action=new Actions(driver);
		action.moveToElement(googleSeachBox).click().keyDown(Keys.SHIFT).sendKeys("images").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		driver.close();
	}
	
	static void dragAndDrop() {
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		Actions action=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]")));
		
		WebElement source=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		WebElement target=driver.findElement(By.id("trash"));
		
		action.dragAndDrop(source, target).build().perform();
		
		driver.close();
	}
	
	static void mouseHoverPractice() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement mouseHover=driver.findElement(By.id("mousehover"));
		Actions action=new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
		driver.close();
		
		/*
		int xoffset=mouseHover.getLocation().getX();
		int yOffset=mouseHover.getLocation().getY();
		
		action.moveToElement(mouseHover, xoffset, yOffset);
		*/
	}
	
	
	
	
	
	

}
