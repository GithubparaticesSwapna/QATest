package testng.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleTestCase implements Bowers {

	@Test
	public void testCase1() {
		
		System.out.println("First Test Case");
		/*System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		
		driver.get(AUTOMATION_URL);
		driver.quit();*/
	}
	
	@Test
	public void testCase2() {
		System.out.println("Second Test Case");
		/*System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		
		driver.get(AUTOMATION_URL);
		driver.quit();*/
	}
	
	@Test
	public void testCase3() {
		System.out.println("Third Test Case");
		/*System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		
		driver.get(AUTOMATION_URL);
		driver.quit();*/
	}
	
	
	@BeforeMethod
	public void precondition() {
		System.out.println("Precondition code ::::");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("************");
	}
}



