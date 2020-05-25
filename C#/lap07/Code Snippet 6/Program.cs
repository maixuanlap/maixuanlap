using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_6
{
    class Program
    {
      static class Product
        {
            static int productID;
            static double productPrice;
            static Product()
            {
                productID = 10;
                productPrice=163.444;
            }
            public static void Display()
            {
                Console.WriteLine("Product ID:" + productID);
                Console.WriteLine("Product Price:" + productPrice);
            }
        }
        class Medicile
        {
            static void Main(string[] args)
            {
                Product.Display();
            }
        }
       
    }
}
