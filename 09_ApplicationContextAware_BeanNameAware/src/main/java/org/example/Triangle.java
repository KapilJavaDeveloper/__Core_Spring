package org.example ;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;

public class Triangle implements ApplicationContextAware , BeanNameAware{
     private Point pointA ;
     private Point pointB ;
     private Point pointC ;
     private ApplicationContext applicationContext ;

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
    public void setApplicationContext(ApplicationContext applicationContext){
        this.applicationContext = applicationContext ;
    }

    @Override
    public void setBeanName(String beanName){
        System.out.println("Bean name be: " + beanName) ;

    }

}