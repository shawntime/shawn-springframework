package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;

public class DefaultSingleBeanRegisty implements SingleBeanRegistry {

    private Map<String, Object> beanNameMap = new HashMap<>();

    @Override
    public Object getSingletonBean(String beanName) {
        return beanNameMap.get(beanName);
    }

    @Override
    public Object getSingletonBean(Class<?> clazz) {
        return beanNameMap.get(StrUtil.lowerFirst(clazz.getSimpleName()));
    }

    protected void addSingletonBean(String beanName, Object bean) {
        beanNameMap.put(beanName, bean);
    }

    protected void addSingletonBean(Class<?> clazz, Object bean) {
        String beanName = StrUtil.lowerFirst(clazz.getSimpleName());
        addSingletonBean(beanName, bean);
    }
}
