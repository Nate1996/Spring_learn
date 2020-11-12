package com.NATE.demo1;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 自动生存代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seehouse();
        // 动态代理的本质，就是通过使用反射机制来实现
        Object result = method.invoke(rent,args);
        fare();
        return result;
    }

    public void seehouse(){
        System.out.println("中介带你看房子");
    }
    public  void fare(){
        System.out.println("收中介费");
    }
}
