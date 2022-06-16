package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_YouTubeSearch_TestNG_Demo_Properties {
	static WebDriver driver = null;
	public static String browserName = null;
	@BeforeTest
	public void setUpTest() {
		String propertyPath=System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
		
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			System.out.println(propertyPath);
			System.setProperty("webdriver.edge.driver",propertyPath+ "\\Drivers\\edgedriver\\msedgedriver.exe");
		    driver = new EdgeDriver();
			}
	}
	@Test
	public void youtube_search() {
		driver.get("https://youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("295");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
	}
	@AfterTest
	public void tear_down() {
		System.out.println("Google test Completed");
		PropertiesFile.setProperties();
	}

}
