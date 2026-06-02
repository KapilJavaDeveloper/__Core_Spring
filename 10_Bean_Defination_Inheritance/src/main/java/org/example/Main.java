package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bean Defination Inheritance") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;

        System.out.println("Triangle 1 be: ") ;
        Triangle obj1 = (Triangle) context.getBean("triangle1") ;
        obj1.draw() ;


        System.out.println("Triangle 2 be: ") ;
        Triangle obj2 = (Triangle) context.getBean("triangle2") ;
        obj2.draw() ;


        System.out.println("Triangle 3 be: ") ;
        Triangle obj3 = (Triangle) context.getBean("triangle3") ;
        obj3.draw() ;


      
    }
}