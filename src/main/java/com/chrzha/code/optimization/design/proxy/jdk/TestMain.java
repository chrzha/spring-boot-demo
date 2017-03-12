package com.chrzha.code.optimization.design.proxy.jdk;

import com.chrzha.code.optimization.design.proxy.MyDBQuery;

/**
 * Created by chrzha on 17-3-12.
 */
public class TestMain {
    public static void main(String[] args) {
        MyDBQuery myDBQuery = JDKDBQueryProxyHandler.createJDKProxy();
        String res = myDBQuery.request("jdk dynamic proxy");
        System.out.println(res);
    }
}
