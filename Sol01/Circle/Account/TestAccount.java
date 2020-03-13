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
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1, "Mia xuan lap");
        System.out.println("ID " + a1.getId() + ", The Name: " + a1.getName());
        System.out.println(a1.toString());
        System.out.println("credit: " + a1.credit(5));
        System.out.println("Debit:" + a1.debit(3));        
        System.out.println("tranferTo " + a1.transferTo(a1, 7));
        System.out.println("---------------------");
        
        
        Account a2 = new Account(2, "Tom", 10);
        System.out.println("ID " + a2.getId() + ", The Name: " + a2.getName() + " The Balance " + a2.getBalance());
        System.out.println(a2.toString());
         System.out.println("credit: " + a2.credit(10));
        System.out.println("Debit:" + a2.debit(10));      
        System.out.println("tranferTo " + a2.transferTo(a2, 10));
        System.out.println("----------------------");
        
        
        Account a3 = new Account(3, "Robert Downey Jrc", 20);
        System.out.println("ID " + a3.getId() + ", The Name: " + a3.getName() + " The Balance " + a3.getBalance());
        System.out.println(a1.toString());
         System.out.println("credit: " + a3.credit(10));
        System.out.println("Debit:" + a3.debit(10));   
        System.out.println("tranferTo " + a3.transferTo(a3, 5));
    }
}
