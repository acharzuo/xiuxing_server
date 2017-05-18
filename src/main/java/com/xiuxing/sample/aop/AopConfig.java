package com.xiuxing.sample.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by achar on 2017/5/18.
 */
@Configuration
@ComponentScan("com.xiuxing.sample.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
