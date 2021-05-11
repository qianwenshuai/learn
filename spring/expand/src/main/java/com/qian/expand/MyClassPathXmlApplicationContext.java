package com.qian.expand;

import com.qian.expand.beanFactoryPostProcessor.MyBeanDefinitionRegistryPostProcessor;
import com.qian.expand.beanFactoryPostProcessor.MyBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: qws
 * @description: 扩展spring容器
 * @date: 2021/5/11 15:05
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
    public MyClassPathXmlApplicationContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        System.out.println("扩展 initPropertySources()...");
        getEnvironment().setRequiredProperties("username");
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//        super.setAllowBeanDefinitionOverriding(false);
//        super.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }

    @Override
    protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
        super.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
    }
}
