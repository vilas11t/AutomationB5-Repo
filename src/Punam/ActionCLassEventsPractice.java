package Punam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionCLassEventsPractice {
	static WebDriver driver;
	@Test
	public static void main(String[] args) throws InterruptedException {
		SystemProperties.setProp();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		testMouseHover();
		Thread.sleep(1000);
		testSearchBox();
		
	}
	
	@Test
	private static void testSearchBox() {
		// TODO Auto-generated method stub
		WebElement we =driver.findElement(By.id("twotabsearchtextbox"));
		Actions action=new Actions(driver);
		we.sendKeys("Shoes");
		action.click(driver.findElement(By.id("nav-search-submit-button"))).build().perform();
	}
	
	@Test
	private static void testMouseHover() {
		// TODO Auto-generated method stub
		WebElement we=driver.findElement(By.id("icp-nav-flyout"));
		//List<WebElement> e=driver.findElements(By.xpath(null));
		Actions action=new Actions(driver);
		action.click(we).build().perform();
		driver.navigate().back();
	}
	
	@Test
	void main() {
		System.out.println("This is test method from poonam package");
	}
	
}
