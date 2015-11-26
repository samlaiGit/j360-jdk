package me.j360.jdk.application.remote.annotation;

import java.lang.annotation.*;


/**
 * 标识字段可以非空
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface Nullable {
}
