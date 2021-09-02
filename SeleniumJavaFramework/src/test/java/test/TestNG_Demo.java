package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFIle;


//Program taken from Test1_GoogleSearch
public class TestNG_Demo {
	WebDriver driver = null;
	public static String browserName=null;

	@BeforeTest
	public void SetupTest() {
		String projectpath = System.getProperty("user.dir");
		PropertiesFIle.getProperties();

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
	}
	@Test
	public void googleSearch( ) {
		//goto google.com
		driver.get("https://google.com");

		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		//click on search button
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
//		driver.quit();
		System.out.println("Test Completed Successfully!!!");
		PropertiesFIle.setProperties();

	}

}
