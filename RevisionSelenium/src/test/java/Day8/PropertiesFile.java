package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String propertyPath =System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties() {
		
		try {
			
			InputStream input = new FileInputStream(propertyPath+"\\src\\test\\java\\Day8\\config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			Test_YouTubeSearch_TestNG_Demo_Properties.browserName=browser;
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(propertyPath+"\\src\\test\\java\\Day8\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
