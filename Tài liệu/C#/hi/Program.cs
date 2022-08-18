using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace thi
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Product[] product= new Product[6];
            product[0] = new Book(1,"van",3636,"vn");
            product[1] = new Book(2,"toan",3636, "vn");
            product[2] = new Book(3,"ta",3636, "vn");
            product[3] = new MobilePhone(1,"Iphone",3636, "vn");
            product[4] = new MobilePhone(2,"Samsung",3636, "vn");
            product[5] = new MobilePhone(3,"oppo",3636, "vn");

            double book = 0;
            for (int i = 0; i <= 2; i++)
            {
                book += product[i].ComputeTax();          
            }          
            double MobilePhone = 0;
            for (int i = 3; i <= 5; i++)
            {
                MobilePhone += product[i].ComputeTax();
            }
            double sum = 0;
            for (int i = 0; i < product.Length; i++)
            {
                sum += product[i].ComputeTax();
                Console.WriteLine(product[i].ToString());
            }
            Console.WriteLine("Compute Total tax of Book: " + book);
            Console.WriteLine("Compute Total tax of MobilePhone: " + MobilePhone);
            Console.WriteLine("Compute Total tax : " + sum);
        }
    }
}
