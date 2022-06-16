package Day12;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  String propertyPath=System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tDP1TeosjRIVmA0YHRg8GJJTUqsBAAxsgTV&q=ebay&rlz=1C1RXQR_enIN1008IN1008&oq=eb&aqs=chrome.1.69i59j46i39i199i291j69i57j69i59j0i67i131i433j0i20i263i433i512j0i131i433i512l3j0i433i512.3174j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://www.ebay.com/");
    driver.findElement(By.id("gh-ac")).click();
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("mobile");
    driver.findElement(By.id("gh-btn")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

