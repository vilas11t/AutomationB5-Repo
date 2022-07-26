package Krutika;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffMenus {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");		
		driver =new ChromeDriver();		
		driver.get("https://www.rediff.com/");
		toPrintRediffSubMenus();		
		driver.close();

	}

	static void toPrintRediffSubMenus() {
		List<WebElement> menu =driver.findElements(By.xpath("//div[@id=\"tabtable\"]/div"));
		
		for(WebElement elements: menu) {
			System.out.println(elements.getText());
		}
	}
}






