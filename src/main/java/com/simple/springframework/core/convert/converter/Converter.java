package com.simple.springframework.core.convert.converter;

/**
 * 转换器接口
 * @param <S>
 * @param <T>
 */
public interface Converter<S, T> {
    T convert(S source);
}
