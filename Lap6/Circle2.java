/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap6;

/**
 *
 * @author Admin
 */

    public class Circle2 extends Shape {
    private double radius;
    public Circle2(String color,double radius){
        super(color);
        this.radius = radius;
    }
    //getter and setter of the radius
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius* radius* Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius = "+ this.radius+",color ="+super.getColor()+"]";
    }
}

