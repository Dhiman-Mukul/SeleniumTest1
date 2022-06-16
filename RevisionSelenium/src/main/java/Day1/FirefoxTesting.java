package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String propertyPath =System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.gecko.driver", propertyPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
	}

}
