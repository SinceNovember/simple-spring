package com.simple.springframework.beans.factory.config;


/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    /**
     * 根据名称获取单例Bean
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * 注册单例Bean
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName, Object singletonObject);
}
