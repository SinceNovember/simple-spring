package com.simple.springframework.beans;

/**
 * Bean的属性值， 一个对应一个属性
 */
public class PropertyValue {

    /**
     * 对应的属性名称
     */
    private final String name;

    /**
     * 对应的属性值
     */
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
