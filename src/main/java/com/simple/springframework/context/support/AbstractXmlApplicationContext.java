package com.simple.springframework.context.support;

import com.simple.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.simple.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * 从Xml中加载Bean的抽象方法
 *
 **/

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    /**
     * 加载BeanDefinition
     * @param beanFactory
     */
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        //获取Bean所在的地方，抽象方法
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
