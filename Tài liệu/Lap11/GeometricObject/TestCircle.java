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
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(20);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        // resize radius
        Resizable r1 = new ResizableCircle(20);
        System.out.println("radius is the resize= "+ r1.resize(4));
    }
}