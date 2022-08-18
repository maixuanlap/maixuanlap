using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet20
{
    class CodeSnippet20
    {
        private int empId;
        private string empName;
        private int age;
        private double salary;

        CodeSnippet20(int id, string name, int age, double sal)
        {
            Console.WriteLine("Constructor for Employee called");
            empId = id;
            empName = name;
            age = age;
            salary = sal;
        }
        CodeSnippet20()
        {
            Console.WriteLine("Destructor for Employee called");
        }
        static void Main(string[] args)
        {
            CodeSnippet20 objCS20 = new CodeSnippet20(1, "John", 45, 35000);
            Console.WriteLine("Employee ID: " + objCS20.empId);
            Console.WriteLine("Employee Name: " + objCS20.empName);
            Console.WriteLine("Age: " + objCS20.age);
            Console.WriteLine("Salary: " + objCS20.salary);
        }
    }
}
