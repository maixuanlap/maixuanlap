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

    public class Monster {
    private String name;
    //constructer
    public Monster(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this. name = name ;
    }
    public String attack(){
        return "i don't! i am not understand";
    }
}

