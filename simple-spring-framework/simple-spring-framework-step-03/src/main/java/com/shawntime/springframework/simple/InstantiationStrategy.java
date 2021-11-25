package com.shawntime.springframework.simple;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(Class clazz, Constructor constructor, Object... args);
}
