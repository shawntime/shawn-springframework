package com.shawntime.springframework.simple.factory.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JdkInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object createObject(Class clazz, Constructor constructor, Object... args) {
        try {
            return constructor.newInstance(args);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
