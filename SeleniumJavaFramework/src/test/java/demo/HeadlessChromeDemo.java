package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		
		String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
	}

}
