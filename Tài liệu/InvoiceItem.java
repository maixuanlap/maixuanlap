/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlLap01;

/**
 *
 * @author User
 */
public class InvoiceItem {
    private int id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public InvoiceItem(){
        
    }

    public InvoiceItem(int id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int newQty){
        this.qty = newQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double newUnitPrice){
        this.unitPrice = newUnitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" + "id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }
    
    
}
