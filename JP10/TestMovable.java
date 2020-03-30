/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP10;

/**
 *
 * @author Admin
 */
public class TestMovable {
    public static void main(String[]args){
        MovablePoint p1=new MovablePoint(1,2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
        Movable p2=new MovablePoint(3,4);
        p2.moveUp();
        System.out.println(p2);
        Movable p3=(MovablePoint)p2;
        System.out.println(p3);
    }
}
