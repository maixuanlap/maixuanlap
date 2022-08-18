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
public class MovablePoint implements Movable {
   private int x,y;
    public MovablePoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return"("+x+","+y+")";
    }
    @Override
    public void moveUp(){
        y--;
    }
    public void moveDown(){
        y++;
    }
    public void moveLift(){
        x--;
    }
    public void moveRight(){
        x++;
    }
}
