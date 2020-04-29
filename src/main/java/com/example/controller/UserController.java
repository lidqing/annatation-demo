package com.example.controller;

import com.example.annatation.MyController;
import com.example.annatation.MyRequestMapping;

/**
 * @author LDQ
 * @Description TODO
 */
@MyController("/users")
public class UserController {

    @MyRequestMapping(value = "/user/save",name = "saveUser")
    public void saveUser(String user){
        System.out.print(user);
    }

}
