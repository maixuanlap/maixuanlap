/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle;

/**
 *
 * @author Admin
 */
public class TestCircle {
    public static void main(String[]args){
        Circle c1=new Circle();
        System.out.println("11"+c1.getRadius()+"22"+c1.getArea());
        
         Circle c2=new Circle(2.0);
         System.out.println("32"+c2.getRadius()+"12"+c2.getArea());
    }
}
