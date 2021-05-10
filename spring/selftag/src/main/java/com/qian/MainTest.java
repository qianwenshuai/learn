package com.qian;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/10 16:40
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User qws = (User) ac.getBean("qws");
        System.out.println(qws.toString());
    }
}
