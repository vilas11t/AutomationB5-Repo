package tanmay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class selenium {
	

	static WebDriver driver;

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver ();
	    driver.manage().window().maximize();
	    
	    capsTyping();
	    //dragAndDrop();
	    mouseHoverPractice();	
	}
	private static void mouseHoverPractice() {
		
		
	}
	 static void capsTyping() {
		
		 driver.get("https://www.google.com/");
		 WebElement googleSeachBox=driver.findElement(By.xpath("//input[@title='search']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(googleSeachBox).click().keyDown(Keys.SHIFT).sendKeys("images").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build();
		 driver.close(); 
	 
	 
	 
	 
	 } 
	 
	 
}
