package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	static WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		String propertyPath=System.getProperty("user.dir");
		System.out.println(propertyPath);
		System.setProperty("webdriver.chrome.driver", propertyPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	@Test(dataProvider = "test1data")
	public void test1(String Username,String Password) {
		System.out.println(Username+" | "+Password);
		driver.get("https://youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("295");
		driver.findElement(By.id("search-icon-legacy")).click();
	}
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\Mukul Dhiman\\Desktop\\SeleniumRevision\\RevisionSelenium\\excel\\data.xlsx";
		Object data[][]=testData(excelPath, "Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath,String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData = excel.getCellDataString(i, j);
			    data[i-1][j]=cellData;
			}	
			
			System.out.println();
		}
		return data;
	}


}
