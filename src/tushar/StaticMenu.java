package tushar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticMenu {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
	select();
	
	
	}
	
	
	static void select() {
		WebElement menus=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(menus);
		s.selectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("AED");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		
	}
	
}
