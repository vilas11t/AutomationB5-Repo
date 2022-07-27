package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice2 {
	
	// To print Menu on out put console

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		toPrintMenu();
		printSubMenu();
		driver.close();
	}
	
	
	static void toPrintMenu() {
		
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='navbarul']//li//a"));
		
		for(WebElement w:menu) {
			System.out.println(w.getText());
		}
	}
	
	static void printSubMenu() {
	 List<WebElement> menus=driver.findElements(By.xpath("//div[@id='tabtable']//div"));
	 System.out.println("Size of List:"+menus.size());
	 for(int i=0;i<menus.size();i++) {
		 System.out.println(menus.get(i).getText());
	 }
	 
	}
}
