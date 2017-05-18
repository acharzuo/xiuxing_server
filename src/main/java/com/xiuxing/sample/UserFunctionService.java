package com.xiuxing.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by achar on 2017/5/18.
 */
@Service
public class UserFunctionService {

    @Autowired
    FunctionServer functionserver;

    public String SayHello(String word){
        return functionserver.sayHello(word);
    }
}
