package com.shawntime.springframework.simple;

import cn.hutool.core.util.StrUtil;

public abstract class AbstractBeanFactory extends DefaultSingleBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object bean = getSingletonBean(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    @Override
    public Object getBean(Class<?> clazz) {
        String beanName = StrUtil.lowerFirst(clazz.getSimpleName());
        return getBean(beanName);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

    protected abstract Object createBean(Class<?> clazz, BeanDefinition beanDefinition);
}
