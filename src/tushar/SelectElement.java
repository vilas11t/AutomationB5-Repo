package tushar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectElement {
//to select elements in a dropdown menu
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement oldmenu=driver.findElement(By.id("oldSelectMenu"));
		
		Select s=new Select(oldmenu);
		s.isMultiple();
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(4);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
	driver.close();		
		
}
}
