package Day6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
 
	static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		
	 System.out.println("\nHello World...!");
	 logger.trace("This is a Trace message");
	 logger.info("This is Information Message");
	 logger.error("This is Error Message");
	 logger.fatal("This is Fatal Message");
	 logger.warn("This is a Warn Message");
	 System.out.println("Completed");
	}

}
