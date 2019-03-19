package testng.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testng.day1.Bowers;

public class FirstTest implements Bowers {
	@Test
	public void testCase1() {
		
        System.setProperty("org.uncommons.reportng.title", "My Reports");
		System.setProperty(Chrome_key, Chrome_path);
		WebDriver driver=new ChromeDriver();
		Reporter .log("Step 1 : Browser Launched");
		driver.get(AUTOMATION_URL);;
		Reporter .log("Step 2 : URL Entered : "+AUTOMATION_URL);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Reporter .log("Step 3 : Signin link clicked");
		System.out.println("First Test Case");
	}
	
	@Test
	public void testCase2() {
		
		System.out.println("Second Test Case");
	}
	
	@Test
	public void testCase3() {
		
		System.out.println("Third Test Case");
	}
}



