/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap11.Shape.GeometricObject;

/**
 *
 * @author Admin
 */
public class Circle implements GeometricObject {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "";
    }
    @Override
    public double getPerimeter(){
        return this.radius*2.0*Math.PI;
    }
    @Override
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}