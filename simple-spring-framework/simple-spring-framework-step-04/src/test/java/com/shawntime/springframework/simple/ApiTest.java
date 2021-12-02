package com.shawntime.springframework.simple;

import com.shawntime.springframework.simple.factory.PropertyValue;
import com.shawntime.springframework.simple.factory.PropertyValues;
import com.shawntime.springframework.simple.factory.config.BeanDefinition;
import com.shawntime.springframework.simple.factory.config.BeanReference;
import com.shawntime.springframework.simple.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {


    @Test
    public void test_springFactory_with_paramsAndPropertyValues() {

        // 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 注册BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        beanDefinition.setPropertyValues(propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取beanREERS
        UserService userService = (UserService) beanFactory.getBean("userService", 10001, "张三222");
        userService.showInfo();

    }
}
