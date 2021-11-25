package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> beanMap = new HashMap<>();

    @Override
    public Object getSingletonBean(String beanName) {
        return beanMap.get(beanName);
    }

    protected void addSingletonBean(String beanName, Object bean) {
        beanMap.put(beanName, bean);
    }
}
