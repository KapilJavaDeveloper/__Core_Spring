package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("t.xml") ;
        Triangle obj = (Triangle) context.getBean("triangle") ;
        obj.draw() ;
        System.out.println("Running") ;
        System.out.println("I am running") ;
        System.out.println("Running") ;

    }
}