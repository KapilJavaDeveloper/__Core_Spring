package org.example;

public class Triangle {

    private String type ;

    public Triangle(String type){
        this.type = type ;
    }

    // getters
    public String getType(){
        return this.type ;
    }

    public void draw(){
        System.out.println(getType() + " triangle is drawn") ;

    }


}
