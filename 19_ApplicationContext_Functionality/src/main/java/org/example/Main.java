package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("ApplicationContext addition functionality Program.") ;

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        Circle obj = context.getBean(Circle.class) ;
        obj.draw() ;
        System.out.println(obj.a) ;
        System.out.println(context.getMessage("greeting" , null ,"default-greeting",null) ) ;

    }
}