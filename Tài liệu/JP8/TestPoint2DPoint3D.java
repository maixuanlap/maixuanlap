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
public class TestPoint2DPoint3D {
    public static void main(String[]args){
        Point2D p2a=new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b=new Point2D();
         System.out.println(p2b);
         p2a.setX(3);
         p2a.setY(4);
         System.out.println(p2a);
         System.out.println("x is:"+p2a.getX());
         System.out.println("x is:"+p2a.getY());
         
         Point3D p3a=new Point3D(11,12,13);
          System.out.println(p3a);
          Point3D p3b=new Point3D();
          System.out.println(p3b);
          p3a.setX(11);
          p3a.setY(12);
          p3a.setZ(13);
           System.out.println(p3a);
         System.out.println("x is:"+p3a.getX());
         System.out.println("x is:"+p3a.getY());
          System.out.println("x is:"+p3a.getZ());
    }
}
