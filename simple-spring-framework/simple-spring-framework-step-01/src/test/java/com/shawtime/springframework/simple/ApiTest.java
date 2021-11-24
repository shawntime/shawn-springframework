package com.shawtime.springframework.simple;

import com.shawntime.springframework.simple.BeanDefinition;
import com.shawntime.springframework.simple.BeanFactory;
import org.junit.Assert;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_springFactory() {

        // 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 注册BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取bean
        IUserService userService = (IUserService) beanFactory.getBean("userService");
        String userName = userService.getUserName();
        Assert.assertEquals("张三", userName);

    }
}
