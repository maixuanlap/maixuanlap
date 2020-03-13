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
public class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "";
    }
    @Override
    public void moveUp(){
        y-= ySpeed;
        System.out.println(y);
    }
    @Override
    public void moveDown(){
        y += ySpeed;
        System.out.println(y);

    }

    public void moveLeft(){
        x-= xSpeed;
        System.out.println(x);

    }
    public void moveRight(){
        x+= xSpeed;
        System.out.println(x);

    }
}