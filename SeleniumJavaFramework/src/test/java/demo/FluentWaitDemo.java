package demo;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import java.time.Duration;


public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception {
		String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		//driver.findElement(By.linkText("2ahUKEwi_5rapjt7yAhVKAXIKHe-FB1A4ChAWegQIFhAB")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(2000))
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				
				WebElement linkElement = driver.findElement(By.xpath("//h3[contains(text(),'ABCD: Any Body Can Dance - Wikipedia')]"));
				if(linkElement.isEnabled()) {
					System.out.println("Element found");
				}
				return linkElement;
			}
		});
		
		element.click();



		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}


}
