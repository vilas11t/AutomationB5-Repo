package Krutika;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTabHandler {

	static WebDriver driver;
	
	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");		
				driver =new ChromeDriver();				
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
				switchToTab();

			}
			
			static void switchToTab() {
					String title="Rahul Shetty Academy";
					
					String HomePage=driver.getWindowHandle();
					
					driver.findElement(By.id("opentab")).click();
					
					Set<String> windowIds= driver.getWindowHandles();
					
					for(String id:windowIds) {   						
						if(!HomePage.equals(id)) {
							driver.switchTo().window(id);
						}					
					}
					
					System.out.println("New Page Title:"+driver.getTitle());
					driver.close();
								
					driver.switchTo().window(HomePage);
					System.out.println("Home Page Title:"+driver.getTitle());
					driver.close();
										
				}			
	}