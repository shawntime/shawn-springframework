package com.shawntime.springframework.simple.factory.support;

import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;
import com.shawntime.springframework.simple.factory.config.BeanDefinition;
import com.shawntime.springframework.simple.factory.config.BeanDefinitionRegistry;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void registerBeanDefinition(Class clazz, BeanDefinition beanDefinition) {
        String beanName = StrUtil.lowerFirst(clazz.getSimpleName());
        registerBeanDefinition(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }
}
