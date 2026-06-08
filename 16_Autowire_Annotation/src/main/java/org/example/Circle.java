package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle implements Shape{

    @Autowired
    @Qualifier("circleRelated")
    private Point centre ;

    // setters

    public void setCenter(Point centre){
        this.centre = centre ;
    }

    // getters
    public Point getCentre(){
        return this.centre ;
    }

    @Override
    public void display(){
        System.out.println("Circle Center be: (" + getCentre().getX() + "," + getCentre().getY() + ")" ) ;
    }
}
