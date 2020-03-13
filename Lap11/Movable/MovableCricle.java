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
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    public String toString(){
        return"";
    }
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
        System.out.println(center.y);

    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
        System.out.println(center.y);

    }

    @Override
    public void moveLeft() {
        center.x-= center.xSpeed;
        System.out.println(center.x);

    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
        System.out.println(center.x);

    }
}
