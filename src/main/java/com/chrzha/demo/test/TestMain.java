package com.chrzha.demo.test;

import java.io.File;

/**
 * Created by chrzha on 17-3-11.
 */
public class TestMain {
    public static void main(String[] args) {
        File file = new File("classpath:/banner.txt");
        System.out.println(file.getAbsolutePath());
    }
}
