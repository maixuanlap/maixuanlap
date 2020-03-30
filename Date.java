/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
/**
 *
 * @author User
 */
public class Date {
    private int day,month,year;
    
    public Date(){
        
    }
            
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int newday) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int newmonth) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newyear) {
        this.year = year;
    }
    
    public void setDate(int Nday, int Nmonth, int Nyear){
        this.day = Nday;
        this.month = Nmonth;
        this.year = Nyear;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
}