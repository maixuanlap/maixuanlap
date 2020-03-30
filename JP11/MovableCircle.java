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
public class MovableCircle implements Movable {
    private MovavlePoint center;
    private int radius;
     public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
         center=new MovavlePoint(x,y,xSpeed,ySpeed);
     }
}
