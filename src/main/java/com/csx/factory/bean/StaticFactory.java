package com.csx.factory.bean;

import com.csx.bean.Car;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 静态工厂
 * @Author: csx
 * @Date: 2018/01/29
 */
public class StaticFactory {
    private static Car car = new Car();

    private StaticFactory() {
    }

    public static Car createInstance() {
        car.setBrand("静态工厂");
        car.setMaxSpeed(10);
        car.setPrice(1.1);

        return car;
    }
}
