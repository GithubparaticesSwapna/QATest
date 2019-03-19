package testng.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
final boolean runMode=true;
	
	@Test
	public void tc_1() {
		
		System.out.println("Create Acccount Test Case");
	}
	
	@Test(priority=2)
	public void tc_2() {
		
		System.out.println("Edit Acccount Test Case");
	}
	
	@Test(priority=3,enabled=runMode)
	public void tc_3() {
		
		System.out.println("Delete Acccount Test Case");
	}
	
	@Test(enabled=runMode)
	public void tc_4() {
		
		System.out.println("Fourth Acccount Test Case");
	}

	@Test(enabled=runMode)
	public void tc_5() {
		
		System.out.println("Fifth Acccount Test Case");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
}
