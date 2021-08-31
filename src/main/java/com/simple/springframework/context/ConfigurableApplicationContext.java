package com.simple.springframework.context;

import com.simple.springframework.beans.BeansException;

/**
 * 提供了 refresh 这个核心方法
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;

    /**
     * 当程序关闭时，调用所有含有关闭方法或试下了Dispose方法的Bean的close方法
     */
    void registerShutdownHook();

    void close();
}
