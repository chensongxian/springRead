package com.csx.customer;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import javax.naming.NamingEnumeration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/01/26
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name=element.getAttribute("name");
        String email=element.getAttribute("email");

        if(StringUtils.hasText(name)){
            builder.addPropertyValue("name", name);
        }

        if(StringUtils.hasText(email)){
            builder.addPropertyValue("email",email);
        }
    }
}
