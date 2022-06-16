package Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTesting {
	
	public static void main(String[] args) {
		
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.edge.driver",propertyPath+ "\\Drivers\\edgedriver\\msedgedriver.exe");
      WebDriver driver = new EdgeDriver();
      driver.get("https://facebook.com");
		
	}
}
