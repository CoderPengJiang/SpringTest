package com.w3cschool.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringTest
 * @description:
 * @author: Mr.Jiang
 * @create: 2019-10-16 20:57
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext sc=new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld obj=(HelloWorld) sc.getBean("helloWorld");
        obj.getMessage();
    }
}

    