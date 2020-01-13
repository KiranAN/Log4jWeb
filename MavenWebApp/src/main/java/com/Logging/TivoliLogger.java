package com.Logging;

import java.io.Serializable;
import java.net.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

@Component
public class TivoliLogger implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger;
	private static SyslogAppender appender;
	private static String hostname;
	private static LoggerContext loggerContext;
	static {
		try {
			hostname = InetAddress.getLocalHost().getHostName();
			loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
			logger = loggerContext.getLogger("TIVOLI");			
			appender =(SyslogAppender) logger.getAppender("SYSLOG");
			//logger = (Logger) LoggerFactory.getLogger("TIVOLI");
			//appender = (SyslogAppender) logger.getAppender("SYSLOG");
			if(appender !=null) {
				appender.setSyslogHost(hostname);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void executor() {
		if(appender !=null) {
			appender.start();
		}
	}
	
	public void stopExecution() {
		appender.stop();
	}
}