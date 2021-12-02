package com.shawntime.springframework.simple.factory.support;

import cn.hutool.core.util.StrUtil;
import com.shawntime.springframework.simple.factory.BeanFactory;
import com.shawntime.springframework.simple.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingleBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        return getBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        Object bean = getSingletonBean(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }

    @Override
    public Object getBean(Class clazz) {
        return getBean(clazz, null);
    }

    @Override
    public Object getBean(Class clazz, Object... args) {
        String beanName = StrUtil.lowerFirst(clazz.getSimpleName());
        return getBean(beanName, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object... args);
}
