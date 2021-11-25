package com.shawntime.springframework.simple;

public class BeanDefinition {

    private Class clazz;

    public BeanDefinition(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
