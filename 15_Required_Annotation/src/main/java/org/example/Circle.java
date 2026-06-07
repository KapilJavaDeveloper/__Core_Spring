package org.example;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

    private Point point ;

    // setter
    @Required
    public void setPoint(Point point){
        this.point = point ;
    }
    // getter
    public Point getPoint(){
        return this.point ;
    }

    @Override
    public void draw(){
        System.out.println("Circle is drawn with center  ("+ getPoint().getX() + "," + getPoint().getY() + ")") ;
    }


}
