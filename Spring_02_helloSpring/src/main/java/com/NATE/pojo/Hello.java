package com.NATE.pojo;

public class Hello {

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("Hello  "+Name);
    }


}
