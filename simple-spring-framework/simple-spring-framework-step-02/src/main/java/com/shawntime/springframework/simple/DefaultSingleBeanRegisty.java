package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingleBeanRegisty implements SingleBeanRegistry {

    private Map<String, Object> beanNameMap = new HashMap<>();

    private Map<Class<?>, Object> beanClassMap = new HashMap<>();

    @Override
    public Object getSingletonBean(String beanName) {
        return beanNameMap.get(beanName);
    }

    @Override
    public Object getSingletonBean(Class<?> clazz) {
        return beanClassMap.get(clazz);
    }

    protected void addSingletonBean(String beanName, Object bean) {
        beanNameMap.put(beanName, bean);
    }

    protected void addSingletonBean(Class<?> clazz, Object bean) {
        beanClassMap.put(clazz, bean);
    }
}
