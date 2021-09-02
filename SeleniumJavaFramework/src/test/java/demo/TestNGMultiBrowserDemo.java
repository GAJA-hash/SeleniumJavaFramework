package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser Name is : " + browserName);
		System.out.println("Threadid :" +Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectpath+ "\\drivers\\geckodriver\\geckodriver.exe" );	
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectpath+"\\drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}
