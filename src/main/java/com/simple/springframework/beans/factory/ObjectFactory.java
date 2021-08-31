package com.simple.springframework.beans.factory;

import com.simple.springframework.beans.BeansException;

public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}