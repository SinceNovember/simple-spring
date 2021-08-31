package com.simple.springframework.beans.factory.support;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.core.io.Resource;
import com.simple.springframework.core.io.ResourceLoader;

/**
 * Bean获取加载器
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... location) throws BeansException;

}
