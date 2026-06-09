package org.example;


import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Circle implements Shape{

    public Circle(){
        System.out.println("Constructor of Circle") ;
    }


    private Point centre ;

    // setter

    @Resource(name="pointA")
    public void setCentre(Point centre){
        this.centre = centre ;

    }

    // getter
    public Point getCentre(){
        return this.centre ;
    }





    @PostConstruct
    public void Construct(){
        System.out.println("Bean is Created.") ;
    }

    @PreDestroy
    public void Destroy(){
        System.out.println("Bean is going to destroy.") ;

    }

    @Override
    public void draw(){
        System.out.println("Circle draw with centre be: (" + getCentre().getX() + "," + getCentre().getY() +")") ;


    }








}
