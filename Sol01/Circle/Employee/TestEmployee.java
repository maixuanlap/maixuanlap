/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01.Circle.Employee;

/**
 *
 * @author Admin
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, " mai ", " lap ", 16000000);
        e1.setSalary(20000000);
        System.out.println("AnnuaSalary " + e1.AnnuaSalary());
        System.out.println("RaiseSalary " + e1.raiseSalary(23));
        System.out.println(e1.toString());
    }
}
