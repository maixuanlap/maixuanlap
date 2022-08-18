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
public class Square extends  Rectangle {
    private double side;

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.side = getWidth();
    }
    public void setLength(double side){
        this.side = getLength();
    }
    public String toString(){
        return"Square[Rectangle[Shape[Color ="+super.getColor()+",filled= "+super.isFilled()+",width ="+super.getWidth()+",length ="+super.getLength()+"]]";
    }
}