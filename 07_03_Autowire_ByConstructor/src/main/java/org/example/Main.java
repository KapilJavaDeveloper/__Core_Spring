package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Autowire By Constructor") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        Triangle obj = (Triangle) context.getBean("triangle") ;
        obj.draw() ;

    }
}