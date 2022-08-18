/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04;

/**
 *
 * @author Admin
 */
public class Book {
 
 String name;
    double price;
    int qty = 0;
    Author Author = new Author("lap","1542001lap@gmail.com",'m');
    Author Author2 = new Author("hehe","1542001hehe@gmail.com",'m');

    public Book(String name, double price, int qty, String author) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.Author=author;
    }

    public Author getAuthor2() {
        return Author2;
    }

    public void setAuthor2(Author author2) {
        Author2 = author2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    public String getAthorName(){
        return Author.getName();
    }
    public String getAllName(){
        return Author.name+Author2.name;
    }

    public String toString(){
        return "Book[name="+name+",Author[name"+getAthorName()+",email="+Author.email+",gender="+Author.gender+",],price="+price+",qty="+qty+"]";
    }


}

