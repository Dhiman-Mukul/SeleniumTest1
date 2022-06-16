package Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver = null;
	String propertyPath=System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is:"+browserName);
		System.out.println("Thread is:"+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", propertyPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",propertyPath+ "\\Drivers\\edgedriver\\msedgedriver.exe");
		    driver = new EdgeDriver();
		}
	}
	
	@Test
	public void test1() {
		driver.get("https:/www.youtube.com");
	}
	@AfterTest
	public void teardown() {
		System.out.println("Test Completed");
	}

}
