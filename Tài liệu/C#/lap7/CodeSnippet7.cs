using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeSnippet7
{
    class CodeSnippet7
    {
        public static void Addition(int val1, int val2)
        {
            Console.WriteLine(val1 + val2);
        }
        public void Multiply(int val1, int val2)
        {
            Console.WriteLine(val1 * val2);
        }
    }
    class StaticMethods
    {
        static void Main(string[] args)
        {
            CodeSnippet7.Addition(10, 50);
            CodeSnippet7 objCS7 = new CodeSnippet7();
            objCS7.Multiply(10, 20);
        }
    }
}