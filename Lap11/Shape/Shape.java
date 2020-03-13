/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap11.Shape;

import JP8.*;

/**
 *
 * @author Admin
 */
public abstract class Shape {
        private String color = "Red";
        private boolean filled = true;

        public Shape(String color,boolean filled){
            this.color = color;
            this.filled = filled;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return "Shape[ color ="+ this.color+",filled = "+this.filled+"]";
    }

}