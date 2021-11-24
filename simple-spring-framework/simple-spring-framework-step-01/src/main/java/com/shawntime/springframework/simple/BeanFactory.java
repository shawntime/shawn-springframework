package com.shawntime.springframework.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * bean工厂
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * 注册BeanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    public Object getBean(String name) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            return null;
        }
        return beanDefinition.getBean();
    }
}
