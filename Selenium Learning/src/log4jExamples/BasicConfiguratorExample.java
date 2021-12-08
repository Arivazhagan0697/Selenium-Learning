package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {
	
	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class); //Factory design pattern

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.debug("This is debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fetal message");
	}
}
