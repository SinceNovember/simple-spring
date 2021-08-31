package com.simple.springframework.context.support;

import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.FactoryBean;
import com.simple.springframework.beans.factory.InitializingBean;
import com.simple.springframework.core.convert.ConversionService;
import com.simple.springframework.core.convert.converter.Converter;
import com.simple.springframework.core.convert.converter.ConverterFactory;
import com.simple.springframework.core.convert.converter.ConverterRegistry;
import com.simple.springframework.core.convert.converter.GenericConverter;
import com.simple.springframework.core.convert.support.DefaultConversionService;
import com.simple.springframework.core.convert.support.GenericConversionService;

import java.util.Set;

/**
 *  * 提供创建 ConversionService 工厂Bean
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    private Set<?> converters;

    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws BeansException {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }
    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }
}
