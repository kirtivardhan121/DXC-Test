package com.dxc.ld.ui;

import org.apache.log4j.Logger;

public class LoggingDemo {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("UI");
		
		logger.fatal("A sample critical message");
		logger.error("A sample error message");
		logger.info("A sample info message");
		logger.debug("A sample debug message");
		logger.warn("A sample warn message");
		
		System.out.println("Program terminated");
	}
}
