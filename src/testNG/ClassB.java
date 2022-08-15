package testNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ClassB {
	
	// to create group of sanity - ClassAm1, ClassAm2, ClassBm3
		//to create group of smoke - ClassAm2, ClassAm3, ClassBm1, ClassBm2

	@Test(groups= {"smoke"})
	void classBm1() {
		System.out.println("This is class B m1 method");
	}
	
	@Test(groups= {"smoke"})
	void classBm2() {
		System.out.println("This is class B m2 method");
	}
	
	@Test(groups= {"sanity"})
	void classBm3() {
		Assert.assertTrue(false);
	}
}
