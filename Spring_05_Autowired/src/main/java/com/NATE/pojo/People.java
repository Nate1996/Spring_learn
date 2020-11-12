package com.NATE.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {

    @Resource
    //如果显示定义了Autowired的required属性为falase，说明这个对象可以为null,否则不允许为空
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    //有多个对象时，@Quqlifier可以指定对象
    @Qualifier(value = "dog22")
    private Dog dog;
    private String name;

    // @Nullable  字段标记了这个注解，说明这个字段可以为null
 /*   public People(@Nullable String name) {
        this.name = name;
    }
*/
    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
