package com.qian.expand.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/11 15:59
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("自定义实现BeanFactoryPostProcessor...");
    }

    @Override
    public int getOrder() {
        return PriorityOrdered.LOWEST_PRECEDENCE;
    }
}
