package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	static Logger logger=LogManager.getLogger(Log4j.class);
	
	public static void createLog() {
		
	
		logger.info("success");
		
	
	}
}
