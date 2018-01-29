package com.csx.circular.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/01/29
 */
public class Main {
    public static void main(String[] args) {
        /*
         * 循环依赖
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("TestCircularRefrence.xml");
    }
}
