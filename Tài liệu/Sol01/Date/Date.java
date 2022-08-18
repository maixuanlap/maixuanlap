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
public class Date {
     private int day,month,year;
    
            
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        this.year= year;
    }

    public void setMonth(int month) {
        this.month=month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public String toString(){
        return String.format("%02d/%02d/%4d", month,day,year);
    }
    public void setDate(int Nday, int Nmonth, int Nyear){
        this.day = Nday;
        this.month = Nmonth;
        this.year = Nyear;
    }
}
