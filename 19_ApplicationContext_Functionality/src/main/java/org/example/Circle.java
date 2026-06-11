package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.MessageSource;

import javax.annotation.Resource;

@Component
public class Circle implements Shape{

    private Point centre ;
    int a = 89 ;

    private MessageSource messageSource ;

    @Autowired
    public void setmessageSource(MessageSource messageSource){
        this.messageSource = messageSource ;
    }

    public MessageSource getmessageSource(){
        return this.messageSource ;
    }


    // setter
    @Autowired
    @Qualifier("cent")
    public void setCentre(Point centre){
        this.centre = centre ;
    }

    // getter
    public Point getCentre(){
        return this.centre ;
    }

    public void draw(){
        System.out.println(this.messageSource.getMessage("drawing.circle" , null ,"default-circle",null)) ;

        System.out.print("Circle is drawn: ") ;
//        System.out.println("("+ getCentre().getX() + "," + getCentre().getY() + ")") ;
        System.out.println(this.messageSource.getMessage("drawing.point" , new Object[] {centre.getX() , centre.getY() } ,"default-point",null)) ;

        System.out.println(this.messageSource.getMessage("greeting" , null ,"default-greeting",null)) ;
    }


}
