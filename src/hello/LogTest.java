package hello;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);
	
	public void writeLog(){
		LOGGER.info("test");
		LOGGER.error("err");
	}
}
