package com.simple.springframework.aop;

import java.lang.reflect.Method;

/**
 * 方法匹配，找到表达式范围内匹配下的目标类和方法
 */
public interface MethodMatcher {

    boolean matches(Method method, Class<?> targetClass);
}
