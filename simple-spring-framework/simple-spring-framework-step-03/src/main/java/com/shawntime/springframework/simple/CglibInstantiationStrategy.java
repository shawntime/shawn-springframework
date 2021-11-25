package com.shawntime.springframework.simple;

import java.lang.reflect.Constructor;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class CglibInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(Class clazz, Constructor constructor, Object... args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == constructor) {
            return enhancer.create();
        }
        return enhancer.create(constructor.getParameterTypes(), args);

    }
}
