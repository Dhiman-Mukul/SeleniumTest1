package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		//driver.findElement(By.name("search_query")).sendKeys("295");
		//WebElement textBox=driver.findElement(By.name("search_query"));
		//textBox.sendKeys("Sidhu MooseWala");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Tochan");
		List<WebElement> listofelement = driver.findElements(By.xpath("//input"));
		int count = listofelement.size();
		System.out.println("Count of input Elements "+count);
	}

}
