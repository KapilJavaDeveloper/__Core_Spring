package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean , DisposableBean {
    private Point pointA ;
    private Point pointB ;
    private Point pointC ;

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


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean method is called for triangle") ;

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean method is called for triangle.") ;
    }
}
