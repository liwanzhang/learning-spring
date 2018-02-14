package zwl.learning.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-31 下午5:55
 */
public class TimeHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeHandler.class);
    public void printTime() {
        LOGGER.info("CurrentTime = {}", System.currentTimeMillis());
    }
}
