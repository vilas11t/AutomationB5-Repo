package javaBasic;

public class Manager1 extends Employee2{

	public static void main(String[] args) {
		Manager1 m1= new Manager1();
		System.out.println("EMP designation is:"+m1.designation_emp1);
		System.out.println("EMP designation is:"+m1.designation_emp2);

	}

}

class Employee1{  
	String designation_emp1 = "QA";  
}  

class Employee2 extends Employee1{  
	String designation_emp2 = "QC";  
}  



 