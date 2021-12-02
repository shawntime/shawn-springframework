package com.shawntime.springframework.simple.factory.config;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanNane, BeanDefinition beanDefinition);

    void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition);
}
