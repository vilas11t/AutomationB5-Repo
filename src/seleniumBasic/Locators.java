package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	/*
	 * Locators- To locate web element on web page
	 * 
	 * 8 types
	 * 
	 * 1. id 2.Name 3.Class Name 4. Tag name 5. Link text 6. Partial link text 7.
	 * Xpath 8 CSS
	 * 
	 */

	public static void main(String[] args) {
		String expectedErrorText = "Temporary error occured[#5001], please try again.";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		// 1. findElement - return only one webelement, NoSuch element exception
		// 2 findElements - return List of web elements

		WebElement rediffMailLink = driver.findElement(By.className("mailicon123"));

		rediffMailLink.click();

		driver.findElement(By.id("login1")).sendKeys("User1");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.className("signinbtn")).click();

		String ActualErrorText = driver.findElement(By.xpath("//div[@id='div_login_error']//b")).getText();

		if (expectedErrorText.equals(ActualErrorText))
			System.out.println("Error Text matching test cases passes");
		else
			System.out.println("Error text does not matches Test case fails");

	}

}
