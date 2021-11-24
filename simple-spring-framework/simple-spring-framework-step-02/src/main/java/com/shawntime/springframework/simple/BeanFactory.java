package com.shawntime.springframework.simple;

public interface BeanFactory {

    Object getBean(String beanName);

    Object getBean(Class<?> clazz);
}
