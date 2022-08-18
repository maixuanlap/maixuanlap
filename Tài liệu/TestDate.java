/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.TimeZone;
/**
 *
 * @author User
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(24, 7, 2001);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(sdf.format(date)); //-prints-> 2015-01-22T03:23:26Z
        
        
    }
    
}
