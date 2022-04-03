package com.eronapps.util;

import java.util.logging.Logger;

public class Log {
	
	private static Logger log = Logger.getLogger("eronapps: ");
	
	public static Logger get() {
		return log;
	}

}
