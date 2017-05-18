package com.xiuxing.sample.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by achar on 2017/5/18.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.xiuxing.sample.aop.Action)")
    public void annotationPointCut() {}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("方法规则式拦截" + method.getName());


    }

    @Before("execution(* com.xiuxing.sample.aop.DemoMethodService.*(..))")
    public void before( JoinPoint joinPoint){

        MethodSignature signature =(MethodSignature) joinPoint.getSignature();
        Method method =signature.getMethod();
        System.out.println("方法规则式拦截" + method.getName());
    }



}
