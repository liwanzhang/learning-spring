package zwl.learning.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zwl.learning.spring.aop.HelloWorld;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-31 下午6:00
 */
public class AopTest {
    @Test
    public void aopTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext-aop.xml");

        HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWorldImpl1");
        HelloWorld hw2 = (HelloWorld) ctx.getBean("helloWorldImpl2");
        hw1.printHelloWorld();
        System.out.println();
        hw1.doPrint();

        System.out.println();
        hw2.printHelloWorld();
        System.out.println();
        hw2.doPrint();
    }
}
