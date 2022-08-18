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
abstract public class Rectangle extends Shape {
    private int length;
    private int with;
    
    public Rectangle(String color,int lenght,int with){
        super(color);
        this.length=length;
        this.with=with;
    }
    public String toString(){
        
    }
}
