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
public class TestShape {
    public static void main(String[] args) {
        Circle2 ss1 = new Circle2("RED",false,5.5);
        System.out.println(ss1);
        System.out.println(ss1.getArea());
        System.out.println(ss1.getPerimeter());
        System.out.println(ss1.getColor());
        System.out.println(ss1.isFilled());
        System.out.println(ss1.getRadius());

        Circle2 c1 = (Circle2)ss1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle("Broww",false,1.0,2.0);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.toString());

        Square s4 = new Square("blue",false,2.5,3.5,6.6);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());
        System.out.println(s4.isFilled());
        System.out.println(s4.getSide());
        System.out.println(s4.getLength());
    }
}

