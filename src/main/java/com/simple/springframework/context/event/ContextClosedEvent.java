package com.simple.springframework.context.event;

import com.simple.springframework.context.ApplicationEvent;

/**
 * 上下文关闭后触发的事件
 */
public class ContextClosedEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
