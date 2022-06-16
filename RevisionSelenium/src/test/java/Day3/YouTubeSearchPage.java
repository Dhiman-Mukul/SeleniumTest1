package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouTubeSearchPage {
	static WebElement element = null;
	public static WebElement search_area(WebDriver driver) {
	    element = driver.findElement(By.name("search_query"));
		return element;
	}
	
	public static WebElement search_button(WebDriver driver) {
		element = driver.findElement(By.id("search-icon-legacy"));
		return element;
	}

}
