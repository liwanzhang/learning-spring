package zwl.learning.spring.test;

import org.junit.Test;
import zwl.learning.spring.log.LogUtils;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-30 下午3:01
 */
public class LogTest {
    @Test
    public void logTest() {
        new LogUtils().print();
    }
}
