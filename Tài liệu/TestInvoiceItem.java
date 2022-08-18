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
public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem(1, "Coca cola", 15, 20000);
        i1.setQty(20);
        i1.setUnitPrice(15000);
        System.out.println("ID " + i1.getId() + ", The Desc is " + i1.getDesc() + ", The Qty " + i1.getQty() + ", The UnitPrice " + i1.getUnitPrice());
        System.out.println("Total: " + i1.getTotal());
        System.out.println(i1.toString());
    }
}

