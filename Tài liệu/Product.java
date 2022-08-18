/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int qty;
    private String desription;
    public Product(int id,String name,double price,int qty,String desription){
          this.id=id;
          this.name=name;
          this.price=price;
          this.qty=qty;
          this.desription=desription;
    }
    public double getprice(){
        return this.price;
    }
     public int getqty(){
        return this.qty;
    }
     public void setprice(int value){
         this.price=value;
     }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", desription=" + desription + '}';
    }

}

