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
public class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color ;
    }
    public void setCOlor(String color){
        this.color = color;
    }
    public double getArea(){
        System.out.println("Shape unknown! Cannot computer area !");
        return 0;
    }
    @Override
    public String toString (){
       return "Shape[Color = " + this.color+"]";
    }
}