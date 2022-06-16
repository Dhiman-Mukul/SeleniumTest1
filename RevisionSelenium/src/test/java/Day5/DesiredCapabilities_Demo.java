package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("captureNetworkTraffic", true);
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("295");
		driver.findElement(By.id("search-icon-legacy")).click();
	}

}
