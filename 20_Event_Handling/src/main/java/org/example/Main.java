package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Event Handling Program") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        Circle obj = context.getBean(Circle.class) ;
        obj.draw() ;

    }
}