package org.example;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("BeanPostProcessor Program -->") ;

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        context.registerShutdownHook() ;
        Triangle obj1 = (Triangle) context.getBean("triangle") ;
        obj1.draw() ;

    }
}