package org.example;

public class Triangle {
    private String type ;

    // setters
    public void setType(String type){
        this.type = type ;
    }
    public String getType(){
        return this.type ;
    }

    public void draw(){
        System.out.println(getType() +" triangle is drawn") ;
    }

}
