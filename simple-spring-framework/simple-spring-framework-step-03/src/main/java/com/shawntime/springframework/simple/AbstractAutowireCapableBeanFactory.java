package com.shawntime.springframework.simple;

import java.lang.reflect.Constructor;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition definition, Object... args) {
        Class clazz = definition.getClazz();
        Constructor constructor = getConstructor(clazz, args);
        if (constructor == null) {
            throw new BeansException("构造器匹配异常");
        }
        Object bean = instantiationStrategy.instantiate(clazz, constructor, args);
        if (bean == null) {
            throw new BeansException("bean创建失败");
        }
        addSingletonBean(beanName, bean);
        return bean;
    }

    private Constructor getConstructor(Class clazz, Object... args) {
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            int parameterCount = constructor.getParameterCount();
            if (args == null) {
                if (parameterCount == 0) {
                    return constructor;
                }
            } else {
                if (parameterCount != args.length) {
                    continue;
                }
                Class[] parameterTypes = constructor.getParameterTypes();
                for (int i = 0; i < parameterCount; ++i) {
                    Class parameterType = parameterTypes[i];
                    Class<?> aClass = args[i].getClass();
                    boolean equals = isEquals(parameterType, aClass);
                    if (!equals) {
                        continue;
                    }
                }
                return constructor;
            }

        }
        return null;
    }

    private boolean isEquals(Class parameterType, Class<?> aClass) {
        if (aClass.equals(parameterType)) {
            return true;
        }
        if (aClass == Integer.TYPE && parameterType == Integer.class) {
            return true;
        }
        if (aClass == Integer.class && parameterType == Integer.TYPE) {
            return true;
        }
        if (aClass == Long.TYPE && parameterType == Long.class) {
            return true;
        }
        if (aClass == Long.class && parameterType == Long.TYPE) {
            return true;
        }
        if (aClass == Short.TYPE && parameterType == Short.class) {
            return true;
        }
        if (aClass == Short.class && parameterType == Short.TYPE) {
            return true;
        }
        if (aClass == Byte.TYPE && parameterType == Byte.class) {
            return true;
        }
        if (aClass == Byte.class && parameterType == Byte.TYPE) {
            return true;
        }
        if (aClass == Double.TYPE && parameterType == Double.class) {
            return true;
        }
        if (aClass == Double.class && parameterType == Double.TYPE) {
            return true;
        }
        if (aClass == Float.TYPE && parameterType == Float.class) {
            return true;
        }
        if (aClass == Float.class && parameterType == Float.TYPE) {
            return true;
        }
        if (aClass == Boolean.TYPE && parameterType == Boolean.class) {
            return true;
        }
        if (aClass == Boolean.class && parameterType == Boolean.TYPE) {
            return true;
        }
        return false;

    }


}
