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
public class Person {
     private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(){
        this.address = address;
    }
    public String toString(){
        return ""+this.name+"("+this.address+")";
    }
}
