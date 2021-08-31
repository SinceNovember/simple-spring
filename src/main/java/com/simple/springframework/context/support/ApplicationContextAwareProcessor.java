package com.simple.springframework.context.support;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.config.BeanPostProcessor;
import com.simple.springframework.context.ApplicationContext;
import com.simple.springframework.context.ApplicationContextAware;

/**
 * ApplicationContext感知处理器
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
