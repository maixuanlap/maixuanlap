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
public class Employeepartime extends SalaryPolicy{
    private float rate;

    public Employeepartime(float baseSalary){
        super(baseSalary);
        this.rate = 2.5f;
    }
    public Employeepartime(float rate,float baseSalary){
        super(baseSalary);
        this.rate = rate;
    }
    public float getSalary(){
        return rate * super.getBaseSalary();
    }


}