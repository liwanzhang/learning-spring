package zwl.learning.spring.annotation;

/**
 * Created by dmall on 2017/8/28.
 */

import java.lang.annotation.Inherited;

/**
 *
 * @author peida
 *
 */
@Inherited
public @interface Greeting {
    public enum FontColor{ BULE,RED,GREEN};
    String name();
    FontColor fontColor() default FontColor.GREEN;
}