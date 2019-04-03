package com.sodanights.circle.client.aop.proxy;

import com.sodanights.circle.client.aop.config.AopConfig;

public class ProxyFacatory extends AopConfig{

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    protected final SodaProxy createAopProxy() {
        return new SodaProxy(this);
    }
}
