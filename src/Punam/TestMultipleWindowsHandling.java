package Punam;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMultipleWindowsHandling {
	static WebDriver wd;
	public static void main(String[] args) {
		SystemProperties.setProp();
		wd=new ChromeDriver();
		wd.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		switchToWindow();
	}
	private static void switchToWindow() {
		// TODO Auto-generated method stub
		wd.findElement(By.id("opentab")).click();
	}

}
