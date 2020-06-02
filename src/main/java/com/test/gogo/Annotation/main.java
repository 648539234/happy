package com.test.gogo.Annotation;

import java.util.Arrays;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/19
 * @Description: com.test.gogo.Annotation
 * @version: 1.0
 */
public class main {
    public static void main(String[] args) {
        go();
    }
    public static void go(){
        int a  = 1;
        int b = 0 ;
        to();
    }
    public static void to(){
        int a  = 1;
        int b = 0 ;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement[] stackTrace1 = new RuntimeException().getStackTrace();
        System.out.println(Arrays.toString(stackTrace));
        System.err.println(Arrays.toString(stackTrace1));
    }

}
