using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GeometricObjectDemo
{
    public class Program
    {
        static void Main(string[] args)
        {
            Circle c1 = new Circle(2.45, "Blue", 23);
            Console.WriteLine("Circle before change: " + c1.ToString());

            //using properties
            c1.PColor = "Red";
            c1.PWeight = 2.56;

            Console.WriteLine("Circle after change: " + c1.ToString());
            Console.ReadLine();
        }
    }
}