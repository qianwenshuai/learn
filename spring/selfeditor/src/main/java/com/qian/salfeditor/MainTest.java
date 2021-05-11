package com.qian.salfeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/10 16:40
 */
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer = (Customer) ac.getBean("customer");
        System.out.println(customer.toString());
    }
}
