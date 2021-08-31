package com.simple.springframework.context.event;

import com.simple.springframework.beans.factory.BeanFactory;
import com.simple.springframework.context.ApplicationEvent;
import com.simple.springframework.context.ApplicationListener;

public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(ApplicationEvent event) {
        //获取该事件所支持的所有监听器
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }

    }
}
