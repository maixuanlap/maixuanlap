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
public class TestCylinder {
     public static void main(String[] args){
        Cylinder cy1 = new Cylinder(12.3,21.2,"blue");
        Cylinder cy2 = new Cylinder(14.3,22.5,"red");
        System.out.println("Radius is" +cy1.getRadius()
                +", Height is"+ cy1.getHeight()
                +", Color is" +cy1.getColor()
                +",Base area is "+ cy1.getArea()
                +",Volume is "+ cy1.getVolume()
        );

        System.out.println("Radius is" +cy2.getRadius()
                +", Height is"+ cy2.getHeight()
                +", Color is" +cy2.getColor()
                +",Base area is "+ cy2.getArea()
                +",Volume is "+ cy2.getVolume()
        );


    }
}
