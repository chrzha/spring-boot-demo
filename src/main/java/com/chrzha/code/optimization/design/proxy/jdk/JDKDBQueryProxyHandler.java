package com.chrzha.code.optimization.design.proxy.jdk;

import com.chrzha.code.optimization.design.proxy.MyDBQuery;
import com.chrzha.code.optimization.design.proxy.MyDBQueryImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by chrzha on 17-3-11.
 */
public class JDKDBQueryProxyHandler implements InvocationHandler{

    private MyDBQuery myDBQuery = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (myDBQuery == null) {
            myDBQuery = new MyDBQueryImpl();
        }
        return myDBQuery.request(args[0].toString());
    }

    public static MyDBQuery createJDKProxy(){
        MyDBQuery jdkProxy = (MyDBQuery) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[] {MyDBQuery.class}, new JDKDBQueryProxyHandler());
            return jdkProxy;
    }
}
