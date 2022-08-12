package testNG;


import org.testng.annotations.*;

public class TestNGBasic {
	/*
	 
	 TestNG:- 
	 
	 What is testNG-
	 
	 Controlling testCase Execution from testNG.xml
	 TestNG.xml
	 
	 Feature
	 
	 TestNG Annotations
	 include exclude mechanism
	 Priority
	 Grouping
	 Data provider
	 parameter passing
	 parallel execution
	 Assertions
	 reporting.
	 Listeners
	 generating Logs
	
	 
	 
	  
	 Annotations
	 @test
	 @BeforeSuite
     @AfterSuite
     @BeforeTest
	 @AfterTest
	 @BeforeGroups
	 @AfterGroups
	 @BeforeClass
	 @AfterClass
	 @BeforeMethod
	 @AfterMethod
	 
	 */
	
	@BeforeSuite
	void m1() {
		System.out.println("This is before suite method");
	}
	
	@AfterSuite
	void m2() {
		System.out.println("This is after suite method");
	}
	
	
	 @BeforeTest
	 void beforeTest() {
		 System.out.println("This is before Test method");
	 }
	
	 @AfterTest
	 void afterTest() {
		 System.out.println("This is After Test method");
	 }
	 
	 
	 @BeforeClass
	 void beforeClass() {
		 System.out.println("This is before Class");
	 }
	 
	 @AfterClass
	 void afterClass() {
		 System.out.println("This is after class");
	 }
	 
	 
	 @BeforeMethod
	 void beforeMethod() {
		 System.out.println("This is before method");
	 }
	 
	 @AfterMethod
	 void afterMethod() {
		 System.out.println("this is after method");
	 }
	
	
	@Test
	void testMethod1() {
		System.out.println("this is test1");
	}
	
	@Test
	void testMethod2() {
		System.out.println("this is test2");
	}
	
	@Test
	void testMethod3() {
		System.out.println("this is test3");
	}
	
	
	
	

}
