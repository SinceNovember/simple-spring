package com.simple.springframework.beans.factory.config;

/**
 * Bean引用，用于引用其他Bean实例
 */
public class BeanReference {


    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
