package zwl.learning.spring.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-30 下午3:03
 */
public class LogUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogUtils.class);

    public void print() {
        LOGGER.info("{}", "日志");
    }

}
