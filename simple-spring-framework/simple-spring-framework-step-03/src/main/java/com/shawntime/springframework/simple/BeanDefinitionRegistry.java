package com.shawntime.springframework.simple;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition);
}
