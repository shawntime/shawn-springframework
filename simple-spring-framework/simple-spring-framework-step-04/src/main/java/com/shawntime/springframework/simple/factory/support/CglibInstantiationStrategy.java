package com.shawntime.springframework.simple.factory.support;

import java.lang.reflect.Constructor;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class CglibInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object createObject(Class clazz, Constructor constructor, Object... args) {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(clazz);
        // 设置enhancer的回调对象
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        // 创建代理对象
        Class[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes.length == 0) {
            return enhancer.create();
        }
        return enhancer.create(parameterTypes, args);
    }
}
