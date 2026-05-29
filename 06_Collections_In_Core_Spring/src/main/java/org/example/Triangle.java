package org.example;

import java.util.List ;
public class Triangle {

    private List<Point> points  ;

    // setters
    public void setPoints(List<Point> points){
        this.points = points ;
    }



    public void draw(){
        for(Point p : points){
            System.out.println("Point be: (" + p.getX() +"," + p.getY() + ")") ;

        }

    }


}
