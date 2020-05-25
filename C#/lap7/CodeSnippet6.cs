using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet6
{
    static class CodeSnippet6
    {
        static int productId;
        static double price;

        static CodeSnippet6()
        {
            productId = 10;
            price = 156.32;
        }
        public static void Display()
        {
            Console.WriteLine("Product ID: " + productId);
            Console.WriteLine("Product price: " + price);
        }

    }

    class Medicine
    {
        static void Main(string[] args)
        {
            CodeSnippet6.Display();
        }
    }
}