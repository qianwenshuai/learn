package com.qian.expand.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/11 16:17
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("自定义实现BeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry()...");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("自定义实现BeanDefinitionRegistryPostProcessor#postProcessBeanFactory()...");
    }

    @Override
    public int getOrder() {
        return PriorityOrdered.HIGHEST_PRECEDENCE;
    }
}
