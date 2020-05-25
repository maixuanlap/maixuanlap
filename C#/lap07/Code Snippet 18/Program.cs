using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_18
{
    class Program
    {
        static int valueOne=10;
        static int product;
        static Program()
        {
            Console.WriteLine("static contrutor initialixed");
            product = valueOne * valueOne;
        }
        public static void Method()
        {
            Console.WriteLine("Value of product =" + product);
        }
        static void Main(string[] args)
        {
            Program.Method();
        }
    }
}
