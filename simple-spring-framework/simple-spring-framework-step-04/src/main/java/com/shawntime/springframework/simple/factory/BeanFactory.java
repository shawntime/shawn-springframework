package com.shawntime.springframework.simple.factory;

public interface BeanFactory {

    Object getBean(String beanName);

    Object getBean(String beanName, Object... args);

    Object getBean(Class clazz);

    Object getBean(Class clazz, Object... args);
}
