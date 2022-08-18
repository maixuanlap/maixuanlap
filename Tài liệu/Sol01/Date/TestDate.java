/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle.Date;

/**
 *
 * @author Admin
 */
public class TestDate {
        public static void main(String[] args) {
        Date d1 = new Date(15, 4, 2001);
        System.out.println(d1);
        d1.setDay(25);
        d1.setMonth(24);
        d1.setYear(2002);
         System.out.println(d1);
          System.out.println("Year is:"+d1.getYear());
           System.out.println("Month is:"+d1.getMonth());
            System.out.println("Day is:"+d1.getDay());
            d1.setDate(2435,2,3);
             System.out.println(d1);
    }
    
}