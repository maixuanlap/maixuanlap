/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP8;

/**
 *
 * @author Admin
 */
public class Cylinder extends Circle {
    private double height;
    //contructors

    public Cylinder(double height , double radius,String color){
        super(radius , color);
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder(height ,radius,color)");
    }
    //Getters and setters
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    // getter Volume
    public double getVolume(){
        return getArea()*height;
    }
    //toString
    public String toString(){
        return " Thiss is a Cylinder";
    }
}
