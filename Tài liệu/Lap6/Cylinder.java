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
public class Cylinder extends Circle{
        private double heights ;
        public Cylinder(double height,double radius){
            super(radius);
            this.heights = height;
        }
        public double getHeight(){
            return this.heights;
        }
        public void setHeight(double height){
            this.heights = height;
        }
        @Override
        public double getArea(){
            return super.getArea() ;
        }
        public double getVolumne(){
            return super.getArea() * this.heights;
        }
        @Override
    public String toString(){
            return "Cylinder[ height ="+ heights +","+ super.toString()+",volumne ="+getVolumne()+"]";
        }

}
