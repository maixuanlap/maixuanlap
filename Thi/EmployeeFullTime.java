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
public class EmployeeFullTime  extends SalaryPolicy  {
     private float rate;

    public EmployeeFullTime(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public  float getSalary(){
        return super.getBaseSalary() * this.rate;
    }

    public static void main(String[] args) {
        EmployeeFullTime e1 = new EmployeeFullTime(4);
        System.out.println(e1.getSalary());
    }
}