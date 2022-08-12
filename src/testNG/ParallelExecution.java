package testNG;

import org.testng.annotations.Test;

public class ParallelExecution {
	
	//Parallel - execution of multiple test cases at a same time
	 // parallel execution- test(test tag from xml), classes, methods
	 // - suite
	
	@Test(priority=5)
	void m1() {
		System.out.println("This is m1 mehtod");
	}
	
	@Test(priority=2)
	void m2() {
		System.out.println("This is m2 mehtod");
	}
	
	@Test
	void m3() {
		System.out.println("This is m3 mehtod");
	}
	
	@Test
	void m4() {
		System.out.println("This is m4 mehtod");
	}
	
	@Test
	void m5() {
		System.out.println("This is m5 mehtod");
	}
	
	@Test
	void m6() {
		System.out.println("This is m6 mehtod");
	}

}
