package com.csx.test;

import com.csx.bean.MyTestBean;
import org.junit.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/01/26
 */
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad(){
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
        System.out.println(myTestBean.getTestStr());
        BeanDefinition beanDefinition = xmlBeanFactory.getBeanDefinition("myTestBean");
        System.out.println(beanDefinition.getAttribute("key"));

    }
}
