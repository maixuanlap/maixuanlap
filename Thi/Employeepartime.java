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
public class Employeepartime extends SalaryPolicy {
     private float rate;

    public EmployeePartime(float rate){
        this.rate = rate;
    }

    @Override
    public float getSalary(){
        return  super.getBaseSalary()* this.rate;
    }

    public static void main(String[] args) {
        EmployeePartime part1 = new EmployeePartime((float) 2.5);
        System.out.println(part1.getSalary());
    }
}