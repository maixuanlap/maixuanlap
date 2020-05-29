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
            double sum = 0;
            Product[] product= new Product[6];
            product[1] = new Book(1,"van",3636,"vn");
            product[2] = new Book(2,"toan",3636, "vn");
            product[3] = new Book(3,"ta",3636, "vn");
            product[4] = new MobilePhone(1,"Iphone",3636, "vn");
            product[5] = new MobilePhone(2,"Samsung",3636, "vn");
            product[6] = new MobilePhone(3,"oppo",3636, "vn");



           
          
            for (int i = 0; i <= 2; i++)
            {
                sum += product[i].ComputeTax();          
            }          
            double MobilePhone = 0;
            for (int j = 3; j <= 5; j++)
            {
                MobilePhone += product[j].ComputeTax();
            }
            double Book = 0;
            for (int k = 0; k < product.Length; k++)
            {
                Book += product[k].ComputeTax();
                Console.WriteLine(product[k].ToString());
            }
            Console.WriteLine("Compute Total tax of Book: " + Book);
            Console.WriteLine("Compute Total tax of MobilePhone: " + MobilePhone);
            Console.WriteLine("Compute Total tax : " + sum);
        }
    }
}
