package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;

public class DefaultBeanDefinitionRegisty implements BeanDefinitionRegisty {

    private Map<String, BeanDefinition> beanNameDefinitionMap = new HashMap<>();

    private Map<Class, BeanDefinition> beanClassDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanClassDefinitionMap.put(beanDefinition.getClazz(), beanDefinition);
        beanNameDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition) {
        beanClassDefinitionMap.put(clazz, beanDefinition);
        beanNameDefinitionMap.put(StrUtil.lowerFirst(clazz.getSimpleName()), beanDefinition);
    }

    protected BeanDefinition getBeanDefinition(String beanName) {
        return beanNameDefinitionMap.get(beanName);
    }

    protected BeanDefinition getBeanDefinition(Class clazz) {
        return beanClassDefinitionMap.get(clazz);
    }
}
