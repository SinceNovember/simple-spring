package com.simple.springframework.context;

import com.simple.springframework.beans.factory.HierarchicalBeanFactory;
import com.simple.springframework.beans.factory.ListableBeanFactory;
import com.simple.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.simple.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
