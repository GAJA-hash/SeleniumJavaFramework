package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoITDemo {
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.file.io/");
//		driver.findElement(By.name("upload-button")).click();  //It does not work because of there is no name
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[2]/label[1]")).click();
		
		Runtime.getRuntime().exec("H:/JAVA/FileUploadScript.exe");
		
		Thread.sleep(3000);
//		driver.close();
		
		
	}

}
