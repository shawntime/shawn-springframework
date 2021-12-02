package com.shawntime.springframework.simple.factory.support;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;
import com.shawntime.springframework.simple.factory.config.SingletonBeanRegistry;

public class DefaultSingleBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> beanMap = new HashMap<>();

    @Override
    public Object getSingletonBean(String beanName) {
        return beanMap.get(beanName);
    }

    @Override
    public Object getSingletonBean(Class clazz) {
        String beanName = getBeanName(clazz);
        return getSingletonBean(beanName);
    }

    protected void registerBean(String beanName, Object bean) {
        beanMap.put(beanName, bean);
    }

    protected void registerBean(Class clazz, Object bean) {
        String beanName = getBeanName(clazz);
        registerBean(beanName, bean);
    }

    private String getBeanName(Class clazz) {
        return StrUtil.lowerFirst(clazz.getSimpleName());
    }
}
