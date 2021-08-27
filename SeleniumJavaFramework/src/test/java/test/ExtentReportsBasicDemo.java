package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentSparkReporter spark = new ExtentSparkReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

		ExtentTest test1 = extent.createTest("Google Search Test One", " this is a test to validate google search functionality");
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting Test Case");
				
		
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in Searchbox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test1.pass("Closed the browser ");
		
		test1.info("Test Completed");
		
ExtentTest test2 = extent.createTest("Google Search Test Two", " this is a test to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting Test Case");
				
		
		driver.get("https://google.com");
		test2.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test2.pass("Entered text in Searchbox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.fail("Pressed keyboard enter key");
		driver.close();
		driver.quit();
		test2.pass("Closed the browser ");
		
		test1.info("Test Completed");
		
		extent.flush();
		
	} 

}
