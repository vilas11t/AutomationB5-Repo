package sayali;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPract12 {

	static WebDriver driver;
	
	public static void main (String[]arges) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		toPrintMenu();
	}
	static void toPrintMenu() {
		
		List<WebElement> menu=driver.findElements(By.xpath("//div[@id='tabtable']//div"));
		for(WebElement w:menu) {
			System.out.println(w.getText());
			
		}
		
				
		
	}
}
