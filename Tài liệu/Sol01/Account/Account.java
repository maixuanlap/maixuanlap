/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle.Account;

/**
 *
 * @author Admin
 */
public class Account {
        private int id;
    private String name;
    private int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public int credit(int amount){
        System.out.println("tong tien ban dau:");
        balance = balance + amount;
        return balance;
    }
    
    public int debit(int amount){
        if(amount<=balance){
            System.out.println("so tien con lai sau khi rut: ");
            return  balance = balance - amount;
        }else{
            System.out.print("Amount exceeded balance ");
        }
        return balance;
    }
    
    public int transferTo(Account another,int amount){
        if(amount<=balance){
            System.out.println("Tong so tien moi them vao: ");
            return balance = balance + amount;           
        }else{
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}