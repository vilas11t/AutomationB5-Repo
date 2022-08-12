package testNG;

import org.testng.annotations.Test;

public class GroupsPractice {

	@Test(groups= {"group1"})
	void abc() {
		System.out.println("This is test method abc");
	}
	
	@Test(groups= {"group2"})
	void xyz() {
		System.out.println("This is test method xyz");
	}
	
	@Test(groups= {"group1","group2"})
	void mno() {
		System.out.println("This is test method mno");
	}
	
	@Test(groups= {"group1"})
	void cbz() {
		System.out.println("This is test method cbz");
	}
	
	@Test(groups= {"group2"})
	void pqr() {
		System.out.println("This is test method pqr");
	}
	
	@Test(groups= {"group1"})
	void klm() {
		System.out.println("This is test method klm");
	}

}
