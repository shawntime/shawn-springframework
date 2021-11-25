package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition createBeanDefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition) {
        String beanName = StrUtil.lowerFirst(clazz.getSimpleName());
        registerBeanDefinition(beanName, beanDefinition);
    }
}
