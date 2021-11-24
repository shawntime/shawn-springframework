package com.shawntime.springframework.simple;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = createBean(beanDefinition.getClazz(), beanDefinition);
        addSingletonBean(beanName, bean);
        return bean;
    }

    @Override
    protected Object createBean(Class<?> clazz, BeanDefinition beanDefinition) {
        try {
            Object bean = clazz.newInstance();
            addSingletonBean(clazz, bean);
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
