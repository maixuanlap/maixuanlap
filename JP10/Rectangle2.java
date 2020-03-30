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
public class Rectangle2 implements Shape2{
    private int length,with;
    public Rectangle2(int lenght,int with){
        this.length=length;
        this.with=with;
    }
    @Override 
    public String toString(){
    return"Rectangle[length="+length+",with="+with+"]";
    }
    @Override
    public double getArea(){
        return length*with;
    }
}
