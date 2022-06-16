package Day7;

public class ExceptionHandlingExample {
    /*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
	}
	
	public static void demo() {
		try {
			System.out.println("Hello World...!");
			int i=1/0;
			System.out.println("Completed");
			}
			catch(Exception exp) {
				System.out.println("I am in the catch block");
				System.out.println("Mesage is :"+exp.getMessage());
				System.out.println("Cause is :"+exp.getCause());
				exp.printStackTrace();
			}
			finally {
				System.out.println("I am inside finally block");
			}
			*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void demo() throws Exception{
		
			System.out.println("Hello World...!");
			throw new ArithmeticException("Not valid operation");
			//int i=1/0;
			//System.out.println("Completed");
			
	}

}