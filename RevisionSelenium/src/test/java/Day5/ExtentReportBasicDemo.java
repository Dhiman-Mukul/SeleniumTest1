package Day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBasicDemo {
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
      ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
      ExtentTest test1 = extent.createTest("Google Search Test One", "this is to validate google search functionality");
      String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting test Info");
	    driver.get("https://youtube.com");
	    test1.pass("Navigated to Youtube");
		driver.findElement(By.name("search_query")).sendKeys("295");
		test1.pass("Enter the text in the search Box");
		driver.findElement(By.id("search-icon-legacy")).click();
		test1.pass("Click on Search Button");
		
		test1.pass("Closed the brower");
		test1.info("Test Completed");
		
		
		 ExtentTest test2 = extent.createTest("Google Search Test Two", "this is to validate google search functionality");
	      
			System.out.println(propertyPath);
			System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		    
			driver = new ChromeDriver();
			test2.log(Status.INFO, "Starting test Info");
		    driver.get("https://youtube.com");
		    test2.pass("Navigated to Youtube");
			driver.findElement(By.name("search_query")).sendKeys("295");
			test2.pass("Enter the text in the search Box");
			driver.findElement(By.id("search-icon-legacy")).click();
			test2.fail("Click on Search Button");
			
			test2.pass("Closed the brower");
			test2.info("Test Completed");
		extent.flush();
		
	}

}
