package com.NATE.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.NATE.pojo.User"/>
// @Component组件

@Component
public class User {

    // 相当于<property name="name" value="小卷">
    // @Value 适合简单的情况配置，复杂情况还是要通过配置文件
    // Set方法同样也可以注入
    @Value("小卷")
    public String name;

}
