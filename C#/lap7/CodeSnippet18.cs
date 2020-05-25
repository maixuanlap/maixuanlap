using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet18
{
    class CodeSnippet18
    {
        static int valueOne = 10;
        static int product;
        static CodeSnippet18()
        {
            Console.WriteLine("Static Constructor initialized");
            product = valueOne * valueOne;
        }
        public static void Method()
        {
            Console.WriteLine("Value of product = " + product);
        }
        static void Main(string[] args)
        {
            CodeSnippet18.Method();
        }
    }
}