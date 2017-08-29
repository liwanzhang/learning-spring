package zwl.learning.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by dmall on 2017/8/28.
 */

@Target(ElementType.FIELD)
public @interface NoDBColumn {

}
