package com.simple.springframework.aop.framework;

import com.simple.springframework.aop.AdvisedSupport;
import com.simple.springframework.aop.framework.AopProxy;
import com.simple.springframework.aop.framework.Cglib2AopProxy;
import com.simple.springframework.aop.framework.JdkDynamicAopProxy;

/**
 * 其实这个代理工厂主要解决的是关于 JDK 和 Cglib 两种代理的选择问题，有了代
 * 理工厂就可以按照不同的创建需求进行控制。
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }

        return new JdkDynamicAopProxy(advisedSupport);
    }
}
