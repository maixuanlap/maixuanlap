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
public class Point3D extends Point2D {
    private int z;
    public Point3D(int x, int y , int z){
        super(x,y);
        this.z = z;
    }
    public int getZ(){
        return this.z = z;
    }
    public void setZ(int z){
        this.z = z;
    }
    @Override
    // toString
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+this.z+")";
    }
}