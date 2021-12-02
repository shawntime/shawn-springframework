package com.shawntime.springframework.simple.factory.support;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object createObject(Class clazz, Constructor constructor, Object... args);
}
