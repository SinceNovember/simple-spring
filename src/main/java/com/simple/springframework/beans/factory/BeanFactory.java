package com.simple.springframework.beans.factory;


import com.simple.springframework.beans.BeansException;

/**
 * Bean工厂接口，主要获取Bean
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;
//
    boolean containsBean(String name);

}
