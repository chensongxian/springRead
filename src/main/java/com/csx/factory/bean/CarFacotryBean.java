package com.csx.factory.bean;

import com.csx.bean.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/01/29
 */
public class CarFacotryBean implements FactoryBean<Car>{

    @Override
    public Car getObject() throws Exception {
        Car car=new Car();

        car.setBrand("超级跑车");
        car.setMaxSpeed(10);
        car.setPrice(1.1);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }


}
