using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lap1
{
    public class Employee
    {
        private string employeeName;
        private double employeeBaseSalary;
        private int employeeID;


        public string Name
        {
            get { return employeeName; }
            set { employeeName = value; }
        }
        public double BaseSalary
        {
            get { return employeeBaseSalary; }
            set { employeeBaseSalary = value; }
        }
        public int ID
        {
            get { return employeeID; }
            set { employeeID = value; }
        }
        public Employee(String name,double baseSalary)
        {
            this.Name = name;
            this.BaseSalary = baseSalary;
        }
        public double getBaseSalary()
        {
            return this.BaseSalary;
        }
        public string getName()
        {
            return this.Name;
        }
        public int getemployeeID()
        {
            return this.ID;
        }
        public String toString()
        {
            return this.ID + "" + this.Name;
        }
        public virtual String employeeStatus()
        {
            return toString() + "is in the company's system";
        }
    }
}
