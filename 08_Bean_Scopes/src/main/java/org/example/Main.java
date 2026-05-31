package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bean Scopes") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        Triangle obj1 = (Triangle) context.getBean("triangle") ;
        obj1.draw() ;
        Triangle obj2 = (Triangle) context.getBean("triangle") ;

        System.out.println(obj1 == obj2) ;

        System.out.println(obj1.equals(obj2)) ;

       
    }
}