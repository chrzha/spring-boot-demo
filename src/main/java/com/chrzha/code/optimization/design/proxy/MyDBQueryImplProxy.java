package com.chrzha.code.optimization.design.proxy;

/**
 * Created by chrzha on 17-3-12.
 */
public class MyDBQueryImplProxy implements MyDBQuery {

    private MyDBQuery myDBQuery = null;

    @Override
    public String request(String para) {
        System.out.println("proxy query");
        if (myDBQuery == null) {
            myDBQuery = new MyDBQueryImpl();
        }
        return myDBQuery.request(para);
    }
}
