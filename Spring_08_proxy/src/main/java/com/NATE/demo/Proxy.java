package com.NATE.demo;

public class Proxy implements Rent{

    private Landlord landlord;

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public Proxy(){

    }
    public  void rent(){
        seehouse();
        landlord.rent();
        hetong();
        fare();
    }

    public void hetong(){
        System.out.println("签署租赁合同");
    }
    public void fare(){
        System.out.println("收取中介费");
    }
    public void seehouse(){
        System.out.println("中介带你看房子");
    }
}
