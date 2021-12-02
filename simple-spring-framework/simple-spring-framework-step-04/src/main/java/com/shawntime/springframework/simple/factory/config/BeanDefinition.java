package com.shawntime.springframework.simple.factory.config;

import com.shawntime.springframework.simple.factory.PropertyValues;

public class BeanDefinition {

    private Class clazz;

    private PropertyValues propertyValues;

    public BeanDefinition(Class clazz) {
        this.clazz = clazz;
    }

    public BeanDefinition(Class clazz, PropertyValues propertyValues) {
        this.clazz = clazz;
        this.propertyValues = propertyValues;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
