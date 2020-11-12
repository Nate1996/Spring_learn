package com.NATE.diy;

// 使用注解的方式实现AOP


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 标记这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.NATE.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=======方法前=======");
    }

    @After("execution(* com.NATE.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法后========");
    }

    // 在环绕增强中，可以给定一个参数，代表要获取处理切入的点
    @Around("execution(* com.NATE.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        System.out.println(jp.getSignature()); // 获得签名
        // 执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
