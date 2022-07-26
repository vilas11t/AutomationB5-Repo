package dhiraj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedErrorText = "Temporary error occured[#5001], please try again.";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("User1");
		driver.findElement(By.id("pass")).sendKeys("User2");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.cssSelector("div._9ay7")).getText();
        String ActualErrorText =  driver.findElement(By.cssSelector("div._9ay7")).getText();
        
        if (expectedErrorText.equals(ActualErrorText))
			System.out.println("Error Text matching test cases passes");
		else
			System.out.println("Error text does not matches Test case fails");

        
        
        
        
        
        
        driver.quit(); 
	}

}
