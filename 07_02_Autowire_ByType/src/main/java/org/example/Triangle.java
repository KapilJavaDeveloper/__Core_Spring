package org.example;

public class Triangle {
    private Point pointA ;

    // setters
    public void setPointA(Point pointA){
        this.pointA = pointA ;
    }


    // getters
    public Point getPointA(){
        return this.pointA ;
    }


    public void draw(){
        System.out.println("PointA be: (" + getPointA().getX() + "," + getPointA().getY() + ")") ;
    }
}
