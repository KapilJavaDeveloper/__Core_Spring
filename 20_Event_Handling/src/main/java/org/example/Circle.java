package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;



@Component
public class Circle implements Shape , ApplicationEventPublisherAware {

    @Autowired
    @Qualifier("centred")
    private Point centre ;

    private ApplicationEventPublisher eventPublisher ;

    // setter
    public void setCentre(Point centre){
        this.centre = centre ;
    }

    // getter
    public Point getCentre(){
        return this.centre ;
    }

    @Override
    public void draw(){
        System.out.println("Circle is Drawn with centre : ("+ getCentre().getX() + "," + getCentre().getY() + ")") ;
        DrawEvent obj = new DrawEvent(this) ;
        eventPublisher.publishEvent(obj) ;

    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher  ;

    }
}
