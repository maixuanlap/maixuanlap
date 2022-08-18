using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet11
{
    class CodeSnippet11
    {
        interface ISet
        {
            void AcceptDetails(int valOne, string valTwo);
        }
        interface IGet
        {
            void Display();
        }
        class Employee : ISet
        {
            int empID;
            string empName;
            public void AcceptDetails(int valOne, string valTwo)
            {
                empID = valOne;
                empName = valTwo;
            }
            static void Main(string[] args)
            {
                Employee objEmployee = new Employee();
                objEmployee.AcceptDetails(10, "Jack");
                IGet objGet = objEmployee as IGet;
                if (objGet != null)
                {
                    objGet.Display();
                }
                else
                {
                    Console.WriteLine("Invalid casting occurred");
                }
            }
        }
    }
}