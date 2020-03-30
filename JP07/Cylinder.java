/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP07;

/**
 *
 * @author Admin
 */
public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height=height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
        System.out.println("Constructed a Cylinder with Cylinder(height,radius)");
    }
     public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
        System.out.println("Constructed a Cylinder with Cylinder(height,radius,color)");
    }
     public double getHeight(){
         return this.height;
     }
     public void setHeight(double height){
         this.height=height;
     }
     public String toString(){
         return "this is a Cylinder";
     }
}

