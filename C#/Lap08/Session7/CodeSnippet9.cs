using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_9
{
    class CodeSnippet9
    {
        string studentName = "lap";
        string address = "Canifornia";
        public virtual void PrintDetails()
        {
            Console.WriteLine("Student Name: " +studentName);
            Console.WriteLine("Address: " +address);
        }
    }
    class Grade : CodeSnippet9
    {
        string clas="Four";
        float percent = 71.25F;
        public override void PrintDetails()
        {
            Console.WriteLine("Class: " +clas);
            Console.WriteLine("Percentage: " +percent);
        }
    
        static void Main(string[] args)
        {
            CodeSnippet9 objCodeSnippet9 = new CodeSnippet9();
            Grade objGrade = new Grade();
            objCodeSnippet9.PrintDetails();
            objGrade.PrintDetails();

        }
    }
}
