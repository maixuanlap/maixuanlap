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
public class Account {
   int id;
    Customer customer;
    double balance = 0.0;
    public Account(int id , Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;

    }

    public Account() {

    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
    public String toString(){
        return ""+customer+ "balance = $ "+balance;
    }
    public String getCustomerName(){
        return customer.name;
    }
    public double deposit(double amount){
         this.balance += amount;
         return balance;
    }
    public double withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return this.balance-=amount;
        }else {
            System.out.printf("amount withdraw exceeds the current balance!");
        }

        return 0;
    }
}  