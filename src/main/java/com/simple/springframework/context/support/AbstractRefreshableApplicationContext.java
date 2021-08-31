package com.simple.springframework.context.support;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.simple.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 上下文抽象类，主要创建刷新BeanFactory方法
 */
public abstract class AbstractRefreshableApplicationContext extends  AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        //加载BeanDefinition,从Xml或者注解
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;

    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

}
