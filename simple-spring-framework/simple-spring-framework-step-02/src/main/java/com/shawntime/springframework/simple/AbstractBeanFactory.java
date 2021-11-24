package com.shawntime.springframework.simple;

public abstract class AbstractBeanFactory extends DefaultSingleBeanRegisty implements BeanFactory {

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
        Object bean = getSingletonBean(clazz);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(clazz);
        return createBean(clazz, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract BeanDefinition getBeanDefinition(Class<?> clazz);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

    protected abstract Object createBean(Class<?> clazz, BeanDefinition beanDefinition);
}
