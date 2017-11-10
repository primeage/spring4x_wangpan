package sample.unitils.ext;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * weaved bean
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface Weaved {
    /**
     * auto wired type: byName(default) or byType
     *
     * @return auto wired type
     */
    String type() default "byName";
}
