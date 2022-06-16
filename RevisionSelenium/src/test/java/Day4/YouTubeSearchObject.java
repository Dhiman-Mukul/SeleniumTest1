package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class YouTubeSearchObject {
	WebDriver driver = null;
	By textbox_search = By.name("search_query");
	By button_search = By.id("search-icon-legacy");
	public YouTubeSearchObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchButton() {
		driver.findElement(button_search).click();
	}

}
