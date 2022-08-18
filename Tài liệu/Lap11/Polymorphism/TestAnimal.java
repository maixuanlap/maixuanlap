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
public class TestAnimal {
    public static void main(String[] args) {
        Cat a1 = new Cat();
        a1.greeting();
        Dog d1 = new Dog();
        d1.greeting();

        Animal a11 = new Cat();
        a11.greeting();

        Animal a12 = new Dog();
        a12.greeting();

        Animal a13 = new BigDog();
        a13.greeting();


        Dog dog2 = (Dog)a12;
        Cat cat2 = (Cat)a11;
        BigDog bDog2 = (BigDog)a13;

    }
}
