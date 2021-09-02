import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability("ignoreProtectedModeSettings", true);
				
		System.setProperty("webdriver.ie.driver",  projectpath+"\\drivers\\iedriver\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver(caps);  //is deprecated
		
		WebDriver driver=new InternetExplorerDriver(options); 		
		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
	}

}
