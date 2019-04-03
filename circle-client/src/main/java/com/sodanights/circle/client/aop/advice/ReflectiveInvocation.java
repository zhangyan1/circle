package com.sodanights.circle.client.aop.advice;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;


public class ReflectiveInvocation implements MethodInvocation {


	protected Object target;

    protected Method method;

    protected Object[] arguments;

	public ReflectiveInvocation(Object target, Method method, Object[] arguments) {
		this.target = target;
		this.method = method;
		this.arguments = arguments;
	}

	@Override
	public Method getMethod() {
		return method;
	}

	@Override
	public Object[] getArguments() {
		return arguments;
	}

	@Override
	public Object proceed() throws Throwable {
		return method.invoke(target, arguments);
	}

	@Override
	public Object getThis() {
		return target;
	}

	@Override
	public AccessibleObject getStaticPart() {
		return method;
	}
}
