package org.example;

public class Triangle {
    private Point pointA ;
    private Point pointB ;
    private Point pointC ;

    private String str = "Isskander" ;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    // setters
    public void setPointA(Point pointA){
        this.pointA = pointA ;
    }
    public void setpointB(Point pointB){
        this.pointB = pointB ;
    }
    public void setPointC(Point pointC){
        this.pointC = pointC ;
    }


    // getters
    public Point getPointA(){
        return this.pointA ;
    }
    public Point getPointB(){
        return this.pointB ;
    }
    public Point getPointC(){
        return this.pointC ;
    }

    public void draw(){
        System.out.println("PointA be: (" + getPointA().getX() + "," + getPointA().getY() + ")") ;
        System.out.println("PointB be: ("+ getPointB().getX() + "," + getPointB().getY() + ")") ;
        System.out.println("PointC be: (" + getPointC().getX() + "," + getPointC().getY() + ")" ) ;
    }
}
