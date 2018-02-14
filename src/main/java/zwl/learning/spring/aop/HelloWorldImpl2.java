package zwl.learning.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-31 下午5:54
 */
public class HelloWorldImpl2 implements HelloWorld {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldImpl2.class);
    public void printHelloWorld() {
        LOGGER.info("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint() {
        LOGGER.info("Enter HelloWorldImpl2.doPrint()");
        return;
    }
}
