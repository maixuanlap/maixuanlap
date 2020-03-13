/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle.Time;

/**
 *
 * @author Admin
 */
public class TestTime {
    public static void main(String[]args){
        Time t1=new Time(1,2,3);
        System.out.println(t1);
        Time t2=new Time();
        System.out.println(t2);
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Hour is:"+t1.getHour());
        System.out.println("Minute is:"+ t1.getMinute());
        System.out.println("Second is:"+t1.getSecond());
        t1.setTime(23,35,37);
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
