package tushar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSession {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		toPrintTab();
		

	}
		static void toPrintTab() {
			List<WebElement> Tabs=driver.findElements(By.xpath("//div[@class='tabtable corona']//div"));
			
			for(WebElement w:Tabs) {
				System.out.println(w.getText());
			}
			
		}
}
