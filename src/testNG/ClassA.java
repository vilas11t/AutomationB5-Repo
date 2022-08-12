package testNG;

import org.testng.annotations.Test;

public class ClassA {
	
	
	// to create group of sanity - ClassAm1, ClassAm2, ClassBm3
	//to create group of smoke - ClassAm2, ClassAm3, ClassBm1, ClassBm2
	
	@Test(groups= {"sanity"})
	void classAm1() {
		System.out.println("This is class A m1 method");
	}
	
	@Test(groups= {"sanity"})
	void classAm2() {
		System.out.println("This is class A m2 method");
	}
	
	@Test(groups= {"smoke"})
	void classAm3() {
		System.out.println("This is class A m3 method");
	}

}
