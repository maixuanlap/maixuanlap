/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thi;

/**
 *
 * @author Admin
 */
public class TestSalary {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        EmployeeFullTime full1=new EmployeeFullTime();
        EmployeePartime part1=new EmployeePartime();
        System.out.println("Input base salary fulltime employee;");
        full1.setBaseSalary(in.nextFloat());
        System.out.println("Input base salary parttime employee;");
         part1.setBaseSalary(in.nextFloat());
         System.out.println("salary employee fulltime is:"+full1.getSalary());
         System.out.println("salary employee parttime is:"+part1.getSalary());
    }
}
