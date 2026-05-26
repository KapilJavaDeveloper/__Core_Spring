package org.example;

public class Triangle {

    private String type;
    private int height ;



    public Triangle(String type, int height){
        this.type = type ;
        this.height = height ;
    }
    public Triangle(int height){
        this.height= height ;
    }
    public Triangle(String type){
        this.type = type ;
    }

    // getters
    public String getType(){
        return this.type ;
    }

    public int getHeight(){
        return this.height ;
    }

    public void draw(){
        System.out.println(getType() + " triangle is drawn of height "+ getHeight()) ;
    }

}
