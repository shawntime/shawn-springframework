package com.shawntime.springframework.simple.factory.config;

public interface SingletonBeanRegistry {

    Object getSingletonBean(String beanName);

    Object getSingletonBean(Class clazz);
}
