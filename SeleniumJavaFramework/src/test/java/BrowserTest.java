import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		
		/**
		 * using gecko driver the project has been run
		 */
			
		//System.setProperty("webdriver.gecko.driver",projectpath+ "\\drivers\\geckodriver\\geckodriver.exe" );	
		//WebDriver driver = new FirefoxDriver();
		
		/**
		 * chrome driver has been added to the environment variables in system itself 
		 * so System.setProperty can be commented out below
		 */
		System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/**
		 * Using IE project has been run
		 */
		
		//System.setProperty("webdriver.ie.driver", projectpath+"\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com/");
		
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("abcd");
		
		List<WebElement> listofInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listofInputElements.size();
		
		System.out.println("Count of Input elements :" +count);
		/*
		 * I can use the above single line instead of the below two lines
		 */
		
		//WebElement textBox = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		//textBox.sendKeys("Automation Step BY Step");
		/*
		 * Optional sleep time of 3 seconds has been given below along with 
		 * try catch method.
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();
	}
	

}





