package com.chrzha.code.optimization.design.proxy;

/**
 * Created by chrzha on 17-3-12.
 */
public class MyDBQueryImpl implements MyDBQuery{
    public MyDBQueryImpl(){
        try {
            Thread.sleep(5000);
            System.out.println("init real DBQuery");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Override
    public String request(String para) {
        return String.format("Excuting DB query with parameter {%s}...", para);
    }
}
