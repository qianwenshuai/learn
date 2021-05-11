package com.qian.salftag;

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
        User qws = (User) ac.getBean("qws");
        System.out.println(qws.toString());
    }
}
