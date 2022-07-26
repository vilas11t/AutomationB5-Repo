package Punam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingWebElement {
	static WebDriver wd;
	public static void main(String[] args) {
		SystemProperties.setProp();
		wd=new ChromeDriver();
		wd.get("https://www.rediff.com/");
		printElements();
	}

	private static void printElements() {
		// TODO Auto-generated method stub
		List<WebElement> menu=wd.findElements(By.xpath("//div[@id='tabtable']"));
		
		for(WebElement w:menu) {
			System.out.println(w.getText());
		}
	}
}
