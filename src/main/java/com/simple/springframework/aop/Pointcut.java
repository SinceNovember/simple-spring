package com.simple.springframework.aop;

/**
 * 切入点接口，定义用于获取 ClassFilter、MethodMatcher 的两个类，这两个接口
 * 获取都是切点表达式提供的内容
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
