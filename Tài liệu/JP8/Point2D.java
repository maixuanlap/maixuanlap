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
public class Point2D {
    private int x , y;
    public Point2D(int x, int y){
        this.x = x;
        this.y =y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY (){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+this.x + ","+ this.y+")";
    }
}
