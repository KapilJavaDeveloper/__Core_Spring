package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main Class ") ;

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        context.registerShutdownHook() ;
        Triangle obj = (Triangle) context.getBean("triangle") ;
        obj.draw() ;

    }
}