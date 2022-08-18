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
public class TestCircle2 {
    public static void main(String[] args){

        Circle cy1 = new Cylinder(2.3,5);
        System.out.println(cy1.toString());
        System.out.println("the radius is :"+cy1.getRadius());
        System.out.println("the area is:" +cy1.getArea());
    }
}

