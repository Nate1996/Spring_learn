package com.NATE.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Configuration代表一个配置类，相当于beans.xml；
// 归Spring容器托管，注册到容器中，因为它本身就是一个@Component
@Configuration
@ComponentScan("com.NATE.pojo")
@Import(Myconfig2.class)  // 导入另外一个配置类
public class Myappconfig {

    // 注册一个bean，相当于xml中的bean标签
    // 方法的名字，相当于bean标签中的id属性
    // 方法的返回值，相当于bean标签中的class属性

    @Bean
    public User user(){
        return new User(); // 返回要注入到bean的对象
    }
}
