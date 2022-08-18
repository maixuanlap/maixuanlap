/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap11.Shape;

import JP8.*;

/**
 *
 * @author Admin
 */
public class Circle2 extends Shape {
    private double radius = 1.0;

    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius*radius * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return radius*2.0 *Math.PI ;
    }
    public String toString(){
        return "Circle[ Shape [color = "+ super.getColor()+ ",filled = "+super.isFilled()+"], radius = "+ this.radius +"]";

    }
}
