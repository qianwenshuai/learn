package com.qian.salftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/10 15:51
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {


    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
