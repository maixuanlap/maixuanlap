/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04.Class;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private MyPoint center;
    private int radius;

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
    public MyCircle(int x ,int y ,int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;

    }
    public int getCenterX(){
        return center.getX();
    }
   public int getCenterY(){
        return center.getY();
   }
   public  String toString(){
        return "MyCircle [ radius = " +radius+",center = "+center+"]";
   }
   public  double getArea(){
        int xDiff = this.getCenterX() - getCenterX();
        int yDiff = this.getCenterY()  - getCenterY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
   }
   public double Circumference(MyCircle another){
        int xDiff = this.getCenterX() - another.getCenterX();
        int yDiff = this.getCenterY() -another.getCenterY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
   }

    public static class TestMyPoint {
        public static void main(String[] args) {
            MyPoint p1 = new MyPoint(5,7);
            MyPoint p2 = new MyPoint(0,4);
            System.out.println("kc:"+p1.distance(p2));

        }
    }
}