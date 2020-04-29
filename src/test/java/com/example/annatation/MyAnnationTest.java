package com.example.annatation;

import com.example.controller.UserController;
import java.lang.reflect.Method;

/**
 * @author LDQ
 * @Description TODO
 */
public class MyAnnationTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Object o = UserController.class.newInstance();

        //获取类注解
        MyController myController = o.getClass().getAnnotation(MyController.class);
        if (myController != null) {
            System.out.println("@MyController注解的映射地址是：" + myController.value());
            System.out.println("类的全限定名：" + o.getClass().getName());
        }

        //获取方法上的注解
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            MyRequestMapping myRequestMapping = method.getAnnotation(MyRequestMapping.class);
            if (myRequestMapping != null) {
                System.out.println("@MyRequestMapping注解的value是：" + myRequestMapping.value());
                System.out.println("@MyRequestMapping注解的name是：" + myRequestMapping.name());
            }
        }


    }
}
