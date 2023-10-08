package com.devs4j.di.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {

    //@Pointcut("within(com.devs4j.di.aop.*)")
    @Pointcut("@annotation(Devs4jAnnotation)")
    public void targetObjectMethods(){

    }


}
