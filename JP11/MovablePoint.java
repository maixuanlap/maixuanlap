/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP11;

/**
 *
 * @author Admin
 */
public class MovablePoint implements Movable {
    private int x,y,xSpeed,ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return"("+x+","+y+","+xSpeed+","+ySpeed+")";
    }
    @Override
    public void moveUp(){
        y -= ySpeed;
        
    }
    public void moveDown(){
        y=- ySpeed;
    }
    public void moveLeft(){
         x -= xSpeed;
    }
    public void moveRight(){
        x =- xSpeed;
    }
    
}
