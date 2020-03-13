/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle.Rectangle;

/**
 *
 * @author Admin
 */
public class Rectangle {
    private float width;
    private float lenght;
    
    
    public Rectangle(){
        width = 4f;
        lenght = 7f;
    }

    public Rectangle(float width, float lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public float getWidth(){
        return width;
    }
    public void setWidth(float newWidth){
        this.width = newWidth;
    }
    
    public float getLenght(){
        return lenght;
    }
    public void setLenght(float newLenght){
        this.lenght = newLenght;
    }
    
    public float Area(){
        return width * lenght;
    }
    public float Primeter(){
        return (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", lenght=" + lenght + '}';
    }
    
}
