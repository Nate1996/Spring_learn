package com.NATE.demo;


// 租客
public class Client {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        //代理
        Proxy proxy = new Proxy(landlord);
        proxy.rent();
    }
}
