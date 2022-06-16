package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Day3.YouTubeSearchPage;

public class YouTubeSearchPageTest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		youtube_search();

	}
	
	public static void youtube_search() {
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://youtube.com");;
		//driver.findElement(By.name("search_query")).sendKeys("295");
		YouTubeSearchPage.search_area(driver).sendKeys("Legend");
		YouTubeSearchPage.search_button(driver).click();
		
		System.out.println("Google test Completed");
	}

}
