package com.shawntime.springframework.simple;

import org.junit.Assert;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_springFactory_with_beanClass() {

        // 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition(UserService.class, beanDefinition);

        // 获取beanREERS
        IUserService userService = (IUserService) beanFactory.getBean(UserService.class);
        String userName = userService.getUserName();
        Assert.assertEquals("张三", userName);

    }

    @Test
    public void test_springFactory_with_beanName() {

        // 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 注册BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取beanREERS
        IUserService userService = (IUserService) beanFactory.getBean("userService");
        String userName = userService.getUserName();
        Assert.assertEquals("张三", userName);

    }
}
