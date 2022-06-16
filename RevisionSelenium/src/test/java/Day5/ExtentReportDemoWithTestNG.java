package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWithTestNG {
	WebDriver driver ;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void setUp() {
		  htmlReporter = new ExtentSparkReporter("extent.html");
	      extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	}
	@BeforeTest
	public void setUpTest() {
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	@Test
	public void test() {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("http://www.youtube.com");
        test.pass("Navigate to YouTube");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test1() {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void tear_down() {
		System.out.println("Google test Completed");
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}
