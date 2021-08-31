package com.simple.springframework.beans.factory.support;

import cn.hutool.core.util.StrUtil;
import com.simple.springframework.beans.BeansException;
import com.simple.springframework.beans.factory.DisposableBean;
import com.simple.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Method;

/**
 * 关闭Bean适配方法，Bean包装成DisposableBean
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }


    @Override
    public void destroy() throws Exception {
        //1.实现接口DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2. 注解配置 destroy-method {判断是为了避免二次执行销毁}
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            //调用关闭方法
            destroyMethod.invoke(bean);
        }


    }
}
