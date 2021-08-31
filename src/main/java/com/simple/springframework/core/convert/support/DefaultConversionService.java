package com.simple.springframework.core.convert.support;

import com.simple.springframework.core.convert.converter.ConverterRegistry;

/**
 * 默认的转换工具类
 */
public class DefaultConversionService extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }

}