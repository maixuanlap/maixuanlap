/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap6;

/**
 *
 * @author Admin
 */
public class Triangle extends  Shape{
        private int base, height;
        public Triangle(String color, int base, int height){
            super( color);
            this.base = base;
            this.height = height;
        }
        public int getBase(){
            return this.base;
        }
        public int getHeight(){
            return this.height;
        }
        @Override
    public double getArea(){
            return this.base * this.height* 0.5 ;
        }
        @Override
    public String toString(){
            return "Triagle[ base = "+ this.base + ", height =" + this.height+","+super.toString()+"]";
        }
}


