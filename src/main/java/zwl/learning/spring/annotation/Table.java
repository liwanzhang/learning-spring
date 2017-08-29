package zwl.learning.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by dmall on 2017/8/28.
 */
@Target(ElementType.TYPE)
public @interface Table {
    /**
     * 数据表名称注解，默认值为类名称
     * @return
     */
    public String tableName() default "className";
}

