package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePractice extends BaseClass {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=driverInitialize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		TablePractice obj1=new TablePractice();
		obj1.diplaySingleRowOfTable();
		obj1.diplaySingleRowOfTable1();
		obj1.diplaySingleColumnOfTable();
		obj1.sumOfColumnData();
		driver.close();
	}
	
	void diplaySingleRowOfTable() {
		List<WebElement> tableHeader= driver.findElements(By.xpath("//table[@id='product' and @name='courses']/tbody/tr[1]/th"));
		System.out.println(tableHeader.get(0).getText());
		System.out.println(tableHeader.get(1).getText());
		System.out.println(tableHeader.get(2).getText());
	}
	
	void diplaySingleRowOfTable1() {
		List<WebElement> tableData= driver.findElements(By.xpath("//table[@id='product' and @name='courses']/tbody/tr[4]/td"));
		for(int i=0;i<tableData.size();i++) {
			System.out.println(tableData.get(i).getText());
		}
	}
	
	void diplaySingleColumnOfTable() {
		List<WebElement> tableData= driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tbody/tr/td[1]"));
		for(WebElement w:tableData) {
			System.out.println(w.getText());
		}
		
	}
	
	void sumOfColumnData() {
		int sum=0;
		List<WebElement> tableData= driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tbody/tr/td[3]"));
		
		for(WebElement w:tableData) {
			int price=Integer.parseInt(w.getText());
			sum=sum+price;
		}
		System.out.println("Sum of price is:"+sum);
		
	}
	
	
	
	
	

}
