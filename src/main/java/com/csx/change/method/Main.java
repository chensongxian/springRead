package com.csx.change.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/01/26
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("BeanFactoryTest.xml");
        TestChangeMethod testChangeMethod= (TestChangeMethod) applicationContext.getBean("testChangeMethod");

        testChangeMethod.showMe();
    }
}
