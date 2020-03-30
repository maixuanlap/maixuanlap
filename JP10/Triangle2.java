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
public class Triangle2 implements Shape2 {
    private int base,height;
    public Triangle2(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public String toString(){
        return"Triangle2[base="+base+",height="+height+"]";
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
