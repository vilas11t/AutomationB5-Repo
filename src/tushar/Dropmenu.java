package tushar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropmenu {
// to print a dropdown menu using a multiple selection .
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		WebElement dm=driver.findElement(By.id("cars"));
		
		Select s =new Select(dm);
		
		System.out.println(s.isMultiple());
		System.out.println("options in a dropdown menu");
		List<WebElement>Standard=s.getOptions();
		
		for(int i=0;i<Standard.size();i++) {
			System.out.println(Standard.get(i).getText());
		}
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByVisibleText("Saab");
		Thread.sleep(2000);
		s.selectByValue("opel");
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		System.out.println();
		
		s.deselectByIndex(3);
		
		List<WebElement> list=s.getAllSelectedOptions(); // print all selected elements.
		for(WebElement L: list) {
			System.out.println(L.getText());
		}
		
		
		driver.close();
	
		
		
	}
}
