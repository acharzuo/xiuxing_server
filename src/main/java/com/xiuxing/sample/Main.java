package com.xiuxing.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by achar on 2017/5/18.
 */
public class Main {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Diconfig.class);

        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);

        System.out.println(userFunctionService.SayHello("dd1"));

        context.close();
    }
}
