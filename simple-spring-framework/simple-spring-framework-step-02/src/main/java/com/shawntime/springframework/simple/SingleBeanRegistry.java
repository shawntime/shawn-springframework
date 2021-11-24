package com.shawntime.springframework.simple;

public interface SingleBeanRegistry {

    Object getSingletonBean(String beanName);

    Object getSingletonBean(Class<?> clazz);
}
