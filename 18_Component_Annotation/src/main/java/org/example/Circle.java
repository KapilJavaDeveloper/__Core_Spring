package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Circle implements Shape {

    private Point centre ;

    // setter
    @Resource(name="this")
    public void setCentre(Point centre){
        this.centre = centre ;
    }

    // getter
    public Point getCentre(){
        return this.centre ;
    }

    @Override
    public void draw(){
        System.out.println("Circle is drawn with centre ("+ getCentre().getX() + "," + getCentre().getY() + ")") ;
    }


}
