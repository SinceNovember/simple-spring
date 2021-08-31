package com.simple.springframework.test.bean;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.config.BeanPostProcessor;

public class UserPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before:" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after" + beanName);
        return bean;
    }
}
