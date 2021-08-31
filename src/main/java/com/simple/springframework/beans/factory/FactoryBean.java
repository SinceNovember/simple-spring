package com.simple.springframework.beans.factory;

import com.simple.springframework.beans.BeansException;

/**
 * 工厂Bean接口
 *
 */
public interface FactoryBean<T> {

    T getObject() throws BeansException;

    Class<?> getObjectType();

    boolean isSingleton();
}
