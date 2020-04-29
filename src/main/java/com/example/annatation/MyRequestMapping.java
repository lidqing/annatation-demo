package com.example.annatation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author LDQ
 * @Date Created in 9:31 2020/4/29
 */
//在运行时执行
@Retention(RetentionPolicy.RUNTIME)
//只能用在方法上
@Target(ElementType.METHOD)
public @interface MyRequestMapping {
    String value() default "";
    String name() default "";
}
