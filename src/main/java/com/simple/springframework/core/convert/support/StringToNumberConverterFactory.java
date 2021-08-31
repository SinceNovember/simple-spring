package com.simple.springframework.core.convert.support;

import com.simple.springframework.core.convert.converter.Converter;
import com.simple.springframework.core.convert.converter.ConverterFactory;
import com.simple.springframework.util.NumberUtils;
import com.sun.istack.internal.Nullable;

/**
 * 字符串转数字转换器工厂
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }
}
