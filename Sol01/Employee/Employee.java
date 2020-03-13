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
public class Employee {
     private int id;
    private String fistName;
    private String lastName;
    private int salary;
    
    public Employee(){
        
    }

    public Employee(int id, String fistName, String lastName, int salary) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getId(){
        return id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
    
    public int AnnuaSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        return AnnuaSalary() * percent/100 + AnnuaSalary();            
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + ", salary=" + salary + '}';
    }
    
}