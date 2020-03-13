/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap11.Shape.Movable;

/**
 *
 * @author Admin
 */
public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5,6,10,15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(20,2,3,4,5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
