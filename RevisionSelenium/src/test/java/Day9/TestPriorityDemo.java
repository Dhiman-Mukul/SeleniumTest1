package Day9;

import org.testng.annotations.Test;

public class TestPriorityDemo {
	/*
	@Test(priority = 2)
	public void test1() {
		System.out.println("This is test1");
	}
	@Test(priority = -1)
    public void test2() {
    	System.out.println("This is test2");

	}
	@Test(priority = 0)
    public void test3() {
    	System.out.println("This is test3");

	}
	*/
	/*
	@Test(priority = 1)
	public void one() {
		System.out.println("This is test1");
	}
	@Test(priority = 1)
    public void two() {
    	System.out.println("This is test2");

	}
	@Test(priority = 1)
    public void three() {
    	System.out.println("This is test3");

	}
	*/
     @Test
	public void one() {
		System.out.println("This is test1");
	}
	@Test(priority = 1)
    public void two() {
    	System.out.println("This is test2");

	}
	@Test(priority = 1)
    public void three() {
    	System.out.println("This is test3");

	}




}
