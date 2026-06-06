package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("interface in core spring") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;

        Triangle obj1 = (Triangle) context.getBean("triangle") ;
        obj1.draw() ;

         Circle obj2 = (Circle) context.getBean("circle") ;
         obj2.draw() ;

    }
}