package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSearchObjectTest {
	static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    YouTubeSearchObject youtubeobj = new YouTubeSearchObject(driver);
	    driver.get("https://www.youtube.com");
	    youtubeobj.setTextInSearchBox("US");
	    youtubeobj.clickSearchButton();
	}

}
