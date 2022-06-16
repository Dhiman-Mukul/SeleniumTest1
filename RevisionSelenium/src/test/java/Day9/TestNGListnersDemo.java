package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListners.class)
public class TestNGListnersDemo {
	@Test
	public void test1() {
		System.out.println("This is Test1");
	}
	@Test
	public void test2() {
		System.out.println("This is Test2");
		//Assert.assertTrue(false);
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");;
		driver.findElement(By.name("search_query")).sendKeys("295");
		driver.findElement(By.id("search-icon-legacy")).click();
	}
	@Test
	public void test3() {
		System.out.println("This is Test3");
		throw new SkipException("This Test is skipped");
	}

}
