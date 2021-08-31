package com.simple.springframework.context;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
