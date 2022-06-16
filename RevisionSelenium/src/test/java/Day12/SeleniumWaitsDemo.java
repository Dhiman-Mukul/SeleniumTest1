package Day12;

import java.time.Duration;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		youtube_search();

	}
	
	public static void youtube_search() {
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://youtube.com");;
		driver.findElement(By.name("search_query")).sendKeys("295");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
		
		driver.findElement(By.id("abcd")).click();
		System.out.println("Google test Completed");
	}

}
