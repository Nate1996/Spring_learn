package com.NATE.demo1;

public class Client {

    public static void main(String[] args) {

        // 真实角色
        Landlord landlord = new Landlord();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 通过调用程序处理角色来处理要调用的接口对象
        pih.setRent(landlord);

        Rent proxy = (Rent) pih.getProxy();  //这里的proxy是动态生成的

        proxy.rent();
    }

}
