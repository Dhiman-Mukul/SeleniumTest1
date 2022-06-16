package Day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	@Test
	public void test1() {
		System.out.println("I am in Test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am in Test 2");
		//int i=1/0;
	}
	@Test(retryAnalyzer = MyRetry.class)
	public void test3() {
		System.out.println("I am in Test 3");
		Assert.assertTrue(0>1);
	}

}
