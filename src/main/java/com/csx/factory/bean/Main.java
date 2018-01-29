package com.csx.factory.bean;

import com.csx.bean.Car;
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
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanFactory.xml");
        //继承FactoryBean方法的工厂
        Car car= (Car) context.getBean("car");
        System.out.println(car);
        /*
         * 要想直接获取工厂类而不是获取工厂类方法的方法，直接在beanName前面加一个&
         * 注意:此种用法只使用继承自FactoryBean的类
         */
        CarFacotryBean carFacotryBean= (CarFacotryBean) context.getBean("&car");
        System.out.println(carFacotryBean.getObject());

        //静态工厂
        Car carByStaticFactory= (Car) context.getBean("getCarByStaticFactory");
        System.out.println(carByStaticFactory);

        //实例工厂
        Car getCarByInstanceFactory= (Car) context.getBean("&getCarByInstanceFactory");
        System.out.println(getCarByInstanceFactory);

    }
}
