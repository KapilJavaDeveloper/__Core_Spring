package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bean Factory Post Processor Program -->") ;
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        Triangle obj1 = (Triangle) context.getBean("triangle") ;
        obj1.draw() ;
        System.out.println(obj1.getStr()) ;

    }
}