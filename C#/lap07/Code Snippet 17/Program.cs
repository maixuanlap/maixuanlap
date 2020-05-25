using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_17
{
    class Program
    {
        string empName;
        int empAge;
        string deptName;
     

        Program(string name,int num)
        {
            empName = name;
            empAge = num;
            deptName= "Research & Development";
        }
        static void Main(string[] args)
        {
            Program objProgram = new Program("Join", 10);
            Console.WriteLine("objEmp.deptName");
        }
    }
}
