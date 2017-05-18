package com.xiuxing.sample.aop;

import org.springframework.stereotype.Service;

/**
 * Created by achar on 2017/5/18.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {

    }
}
