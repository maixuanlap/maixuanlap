/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap1;

/**
 *
 * @author Admin MAI XUAN LAP
 */
public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r ,String c){
        radius = r;
        color = c;
    }
    //pulic method 
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
}
