package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageObjectTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest1();
		
	}
	public static void googleSearchTest1() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.SetTextInSearchBox("A b c d");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
		System.out.println("Test Completed Successfully!!!");
		}

}
