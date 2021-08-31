package com.simple.springframework.beans.factory;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.simple.springframework.beans.factory.config.BeanDefinition;
import com.simple.springframework.beans.factory.config.BeanPostProcessor;
import com.simple.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * 可配置的Bean列表工厂
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
