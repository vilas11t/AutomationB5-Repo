package tanmay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitpractice {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		impliWait();
		//expliciWait();
		//fluentWait();
		driver.quit();
		
	}

	    static void impliWait() {
	    	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    	driver.get("https://www.rediff.com/");
	    	driver.findElement(By.xpath("//a[@title='Online Shopping']")).click();
	    
	    		
		
		 
		
	}
	
	
	
	
	
	

}
