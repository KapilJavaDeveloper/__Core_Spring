package org.example;

public class Circle implements Shape{

    private Point point ;

    // setters
    public void setPoint(Point point){
        this.point = point ;
    }

    // getters
    public Point getPoint() {
        return this.point;
    }

    @Override
    public void draw(){
        System.out.println("Circle class draw method.") ;
        System.out.println("Point be: (" + getPoint().getX() + "," + getPoint().getY() + ")") ;
    }

}
