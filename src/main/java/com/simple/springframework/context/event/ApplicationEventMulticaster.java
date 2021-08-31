package com.simple.springframework.context.event;

import com.simple.springframework.context.ApplicationEvent;
import com.simple.springframework.context.ApplicationListener;

/**
 * 事件广播器
 */
public interface ApplicationEventMulticaster {

    /**
     * 添加监听器
     * @param applicationListener
     */
    void addApplicationListener(ApplicationListener<?> applicationListener);

    /**
     * 移除监听器
     * @param listener
     */
    void removeApplicationListener(ApplicationListener<?> listener);


    /**
     * 广播所有的事件
     * @param event
     */
    void multicastEvent(ApplicationEvent event);
}
