package com.chrzha.code.optimization.design.proxy;

/**
 * Created by chrzha on 17-3-12.
 */
public class TestMain {
    public static void main(String[] args) {
        MyDBQuery myDBQuery = new MyDBQueryImplProxy();
        myDBQuery.request("name");
    }
}
