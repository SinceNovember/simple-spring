package com.simple.springframework.core.io;

/**
 * 资源加载器，统一资源加载的方式，用户只需要传入地址就行
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
