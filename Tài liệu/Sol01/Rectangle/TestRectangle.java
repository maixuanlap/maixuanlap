/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle.Rectangle;

/**
 *
 * @author Admin
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(5f);
        r1.setLenght(10f);
        System.out.println("The Width of Rectangle is " + r1.getWidth() + ", The lenght of Rectangle is " + r1.getLenght() + ", The Area of Rectangle is " + r1.Area() + ", The Primeter of Rectangle is " + r1.Primeter());
        System.out.println(r1.toString());
    }
    
    
}
