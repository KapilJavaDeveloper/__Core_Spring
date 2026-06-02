package org.example;
import java.util.List ;

public class Triangle {
//    private Point pointA ;
//    private Point pointB ;
//    private Point pointC ;
//
//
//    // setters
//    public void setPointA(Point pointA){
//        this.pointA = pointA ;
//    }
//
//    public void setPointB(Point pointB){
//        this.pointB = pointB ;
//    }
//
//    public void setPointC(Point pointC){
//        this.pointC = pointC ;
//    }
//
//    // getters
//    public Point getPointA(){
//        return this.pointA ;
//    }
//
//    public Point getPointB(){
//        return this.pointB ;
//    }
//
//    public Point getPointC(){
//        return this.pointC ;
//    }
//
//    public void draw(){
//        System.out.println("PointA be: (" + getPointA().getX() + "," + getPointA().getY() + ")" ) ;
//        System.out.println("PointB be: (" + getPointB().getX() + "," + getPointB().getY() + ")" ) ;
//        System.out.println("PointC be: (" + getPointC().getX() + "," + getPointC().getY() + ")" ) ;
//    }

    private List<Point> points ;

    // setters
    public void setPoints(List<Point> points){
        this.points = points ;
    }

    // getters
    public List<Point> getPoints(){
        return this.points ;
    }

    public void draw(){
        for(Point p : points){
            System.out.println("Point be: (" + p.getX() + "," + p.getY() + ")") ;
        }
    }

}
