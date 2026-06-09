package org.example;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("JSR 250 Annotation in Core Spring") ;

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        context.registerShutdownHook() ;
        Circle obj = (Circle) context.getBean("circle") ;
        obj.draw() ;


    }
}