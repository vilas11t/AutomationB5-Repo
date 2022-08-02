package Punam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		SystemProperties.setProp();
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		//DropdownSingleSelection();
		DropdownMultipleSelection();
	}
	private static void DropdownMultipleSelection() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement we=driver.findElement(By.id("cars"));
		Select s=new Select(we);
		if(s.isMultiple()) {
			s.selectByIndex(0);
			Thread.sleep(3000);
			s.selectByVisibleText("Saab");
			Thread.sleep(3000);
			s.selectByValue("audi");
		}

		List<WebElement> selecteditems=s.getOptions();
				System.out.println(((WebElement) selecteditems).getText());
		
	}
	private static void DropdownSingleSelection() {
		// TODO Auto-generated method stub
		WebElement we=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(we);
		
		s.selectByIndex(3);
		s.selectByVisibleText("Option 1");
	}
}
