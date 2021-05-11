package com.qian.expand;

import org.springframework.context.ApplicationContext;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/11 15:08
 */
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person);
    }
}
