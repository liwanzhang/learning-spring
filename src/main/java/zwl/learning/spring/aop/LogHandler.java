package zwl.learning.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-31 下午6:09
 */
public class LogHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogHandler.class);
    public void LogBefore() {
        LOGGER.info("Log before method");
    }

    public void LogAfter() {
        LOGGER.info("Log after method");
    }
}
