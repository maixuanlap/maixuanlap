/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap01.Circle.Car.Circle;

/**
 *
 * @author Admin
 */
public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
       return radius*radius*Math.PI;
    }
}
