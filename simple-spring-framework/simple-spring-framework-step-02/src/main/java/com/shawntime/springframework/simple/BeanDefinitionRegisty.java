package com.shawntime.springframework.simple;

public interface BeanDefinitionRegisty {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition);
}
