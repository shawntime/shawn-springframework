package com.shawntime.springframework.simple;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JdkInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(Class clazz, Constructor constructor, Object... args) {
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
