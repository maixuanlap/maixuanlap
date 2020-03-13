/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap11.Shape.Polymorphism;

/**
 *
 * @author Admin
 */
public class BigDog extends Animal {
    @Override
    public void  greeting(){
        System.out.println("woow!");
    }

    public void greeting(Dog another){
        System.out.println("Woooooooooo!");
    }
}