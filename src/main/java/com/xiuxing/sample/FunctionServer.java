package com.xiuxing.sample;

import org.springframework.stereotype.Service;

/**
 * Created by achar on 2017/5/18.
 */

@Service
public class FunctionServer {


    public String sayHello(String word) {
        return "hello " + word + " !";
    }
}
