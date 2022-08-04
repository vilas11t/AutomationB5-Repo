package tushar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentTable extends BaseClass{

static WebDriver driver;
	
	public static void main(String[] args) {
		driver=driverinitialize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		AssignmentTable obj=new AssignmentTable();
		//obj.displaySingleRowOfTable();
	//	obj.sumOfAmount();
		//obj.printColumn();
		//obj.printRow();
		obj.print();
	}
	void displaySingleRowOfTable(){  // this will display first row of the table (name,position,city,amount)
		List<WebElement> list1=driver.findElements(By.xpath("//table[@id='product']/thead/tr/th"));
	for(WebElement w:list1) {
		System.out.println(w.getText());
	}
	}
	
	void sumOfAmount() {// total amount is 296
		List<WebElement>list2=driver.findElements(By.xpath("(//table[@id='product'])[2]//child::tbody//tr/td[4]"));
	int amount=0;
	for(WebElement w:list2) {
		int Amount=Integer.parseInt(w.getText());
		amount=amount+Amount;
	}
	System.out.println("total amount is:"+amount);
	System.out.println();
	}
	
	void printColumn() {// print the first column data.
		List <WebElement> column=driver.findElements(By.xpath("(//table[@id='product'])[2]//child::tbody//tr/td[1]"));
	for (int i=0;i<column.size();i++) {
		System.out.println(column.get(i).getText());
	}
	}
	
	void printRow() {
		List<WebElement>row=driver.findElements(By.xpath("(//table[@id='product'])[2]//child::tbody//tr[1]/td"));
		for(WebElement x:row) {
			System.out.println(x.getText());
		}
	}
	
	void print() {//to print the data
		List<WebElement>alldata=driver.findElements(By.xpath("(//table[@id='product'])[2]//child::tbody//tr"));
	boolean datastatus=false;
		for(WebElement w:alldata)
		{
			String value=w.getText();
			System.out.println(value);
			if(value.contains("Postman")) 
			{
				datastatus=true;
				break;
			}
		}
	
	}
}

