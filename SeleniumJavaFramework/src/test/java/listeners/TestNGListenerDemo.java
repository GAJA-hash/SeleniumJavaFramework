package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");

		String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("abcd");
		driver.findElement(By.xpath("//body/[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("abcd");
		
		driver.close();


	}
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}


}
