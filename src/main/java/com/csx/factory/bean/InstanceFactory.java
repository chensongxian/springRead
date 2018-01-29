package com.csx.factory.bean;

import com.csx.bean.Car;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 实例工厂
 * @Author: csx
 * @Date: 2018/01/29
 */
public class InstanceFactory {
    private static Car car=new Car();

    private InstanceFactory(){

    }

    public Car createInstance() {
        car.setBrand("实例工厂");
        car.setMaxSpeed(10);
        car.setPrice(1.1);

        return car;
    }
}
