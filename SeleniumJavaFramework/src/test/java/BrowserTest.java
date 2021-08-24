import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
			
		//System.setProperty("webdriver.gecko.driver",projectpath+ "\\drivers\\geckodriver\\geckodriver.exe" );	
		//WebDriver driver = new FirefoxDriver();
		
		/**
		 * chrome driver has been added to the environment variables in system itself 
		 * so System.setProperty can be commented out below
		 */
		//System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.dev/");
		/**
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
