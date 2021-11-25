package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegisty {

    private Map<String, BeanDefinition> beanNameDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        return beanNameDefinitionMap.get(beanName);
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanNameDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition) {
        beanNameDefinitionMap.put(StrUtil.lowerFirst(clazz.getSimpleName()), beanDefinition);
    }
}
