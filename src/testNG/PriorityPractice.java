package testNG;

import org.testng.annotations.Test;

public class PriorityPractice {
	
	@Test(priority=-10)
	void abc() {
		System.out.println("This is test method abc");
	}
	
	@Test(invocationCount=2,priority=-20)
	void xyz() {
		System.out.println("This is test method xyz");
	}
	
	@Test(priority=-1)
	void mno() {
		System.out.println("This is test method mno");
	}
	
	@Test(priority=1)
	void cbz() {
		System.out.println("This is test method cbz");
	}
	
	@Test(enabled= false)
	void pqr() {
		System.out.println("This is test method pqr");
	}
	
	@Test
	void klm() {
		System.out.println("This is test method klm");
	}
	
	@Test(groups= {"group1"})
	void m1() {
		System.out.println("This is test method m1 from priority class");
	}

}
