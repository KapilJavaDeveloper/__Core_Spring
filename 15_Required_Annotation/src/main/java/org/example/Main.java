package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Required Annotation in Core Spring") ;

try {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Circle obj = (Circle) context.getBean("circle");
    obj.draw();

}
catch(Exception e){
//    e.printStackTrace();
    System.out.println("Exception Occured") ;

}

    }
}