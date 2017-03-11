package com.chrzha.springboot.demo.test;

import java.io.File;

/**
 * Created by chrzha on 17-3-11.
 */
public class TestMain {
    public static void main(String[] args) throws Exception{

        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        Class.forName("");
        ClassLoader.getSystemClassLoader().loadClass("");

    }
}
