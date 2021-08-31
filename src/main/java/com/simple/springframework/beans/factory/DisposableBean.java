package com.simple.springframework.beans.factory;

/**
 * 可摧毁的Bean
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
