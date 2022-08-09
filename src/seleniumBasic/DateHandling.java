package seleniumBasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class DateHandling extends BaseClass {

/*
 format
 todays date
 tomorrow date / some future date
 yesterday / previous date
 
 Date- class
 SimpleDateFormat- 
 Calendar- Abstract class
 
Date Format with MM/dd/yyyy : 04/13/2015
Date Format with dd-M-yyyy hh:mm:ss : 13-4-2015 10:59:26
Date Format with dd MMMM yyyy : 13 April 2015
Date Format with dd MMMM yyyy zzzz : 13 April 2015 India Standard Time
Date Format with E, dd MMM yyyy HH:mm:ss z : Mon, 13 Apr 2015 22:59:26 IST
 */
	
	static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		String todaysdate=sdf.format(date);
		System.out.println(todaysdate);
		
		
		
		
		
		Date tdate=new Date();
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(tdate);
		cal.add(Calendar.YEAR, 1);
		
		tdate=cal.getTime();
		
		
		String tomorrowDate=sdf.format(tdate);
		System.out.println("Tomorrow Date:"+tomorrowDate);
		
		
		Date pastdate=new Date();
		
		cal.setTime(pastdate);
		cal.add(Calendar.DATE, -2);
		pastdate=cal.getTime();
		
		String pastDateInString=sdf.format(pastdate);
		System.out.println("Past Date:"+pastDateInString);
		
		System.out.println("Day no:-"+cal.get(Calendar.DAY_OF_WEEK));
		
		
		
	}
	
	
		

}
