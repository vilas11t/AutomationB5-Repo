package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersPassingPratice {
	
	
	@Test
	@Parameters({"adminName","adminPassword"})
	void adminLogin(String adminName,String adminPass) {
		System.out.println("Admin User Name:"+adminName+"\n Admin Password:"+adminPass);
	}

}
