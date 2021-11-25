package com.shawntime.springframework.simple;

import cn.hutool.core.util.StrUtil;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        return getBean(beanName, null);
    }

    @Override
    public Object getBean(Class clazz) {
        return getBean(clazz, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        Object bean = getSingletonBean(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = createBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }

    @Override
    public Object getBean(Class clazz, Object... args) {
        String beanName = StrUtil.lowerFirst(clazz.getSimpleName());
        return getBean(beanName, args);
    }

    protected abstract BeanDefinition createBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition definition, Object... args);
}
