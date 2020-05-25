using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_20
{
    class Program
    {
        private int empID;
        private string empName;
        private int age;
        private double salary;
        Program(int id,string name,int age,double sal)
        {
            Console.WriteLine("Contructor for Program called");
            empID = id;
            empName = name;
            age = age;
            salary = sal;
        }
        Program()
        {
            Console.WriteLine("Destructor for Progarm called");
        }
        static void Main(string[] args)
        {
            Program objEmp=new Program(1, "John", 45, 35000);
            Console.WriteLine("Program ID:" + objEmp.empID);
            Console.WriteLine("Program Name:" + objEmp.empName);
            Console.WriteLine("Age:" + objEmp.age);
            Console.WriteLine("Salary:" + objEmp.salary);
        }
    }
}
