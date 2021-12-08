package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorExample {
	static Logger logger = Logger.getLogger(XMLConfiguratorExample.class); //Factory design pattern

	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("This is debug message");
		logger.info("This is an info message");
		logger.warn("This is a warning message");
		logger.error("This is an error message");
		logger.fatal("This is a fetal message");
	}

}
