/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04.Customer;

/**
 *
 * @author Admin
 */
public class Customer {
    int ID;
    String name;
    char gender;
    int discount;
    public Customer(int ID, String name,int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return " "+name+"("+getID()+")";
    }
}