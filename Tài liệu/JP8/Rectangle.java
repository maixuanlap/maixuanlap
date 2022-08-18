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
public class Rectangle extends Shape {
    private  double width = 1.0;
    private double length = 1.0;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return this.width * this.length ;
    }
    @Override
    public double getPerimeter(){
        return (this.length + this.width)*2;
    }
    public String toString(){
        return "Rectangle[shape[color ="+super.getColor()+"filled = "+super.isFilled()+",] width ="+this.width+",length ="+this.length+"]";
    }
}