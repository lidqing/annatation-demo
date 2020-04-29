package com.example.annatation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author LDQ
 * @Date Created in 9:59 2020/4/29
 */
//在运行时执行
@Retention(RetentionPolicy.RUNTIME)
//用在类上
@Target(ElementType.TYPE)
public @interface MyController {

    String value() default "";

}
