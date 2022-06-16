package Day10;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
	@Test
	 @Parameters({"MyName"})
	public void test(@Optional("Mukul Dhiman")String name) {
		System.out.println("Name is:"+name);
	}

}
