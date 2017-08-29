package zwl.learning.spring.test;

import org.junit.Test;
import zwl.learning.spring.annotation.definition.Apple;
import zwl.learning.spring.annotation.definition.FruitInfoUtil;

/**
 * @author zhangwanli
 * @description
 * @date 2017-08-28 下午5:12
 */
public class AnnotationTest {
    @Test
    public void annotationTest() {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}
