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
public class TestShape {
    public static void main(String[] args){
        Shape  s1 = new Rectangle("red",24,12);
        System.out.println(s1.toString());
        System.out.println("the area is:"+ s1.getArea() );
        System.out.println("the color is :"+ s1.getColor());

        //Triangle

        Shape s2 = new Triangle("blue",23,12);
        System.out.println(s1.toString());
        System.out.println("the area is:"+s2.getArea());
        System.out.println(" the color is:"+ s2.getColor());

        // Circle
        Shape  s3 = new Circle2("broww",24.2);
        System.out.println(s3.toString());
        System.out.println("the area is:"+s3.getArea());
    }
}
