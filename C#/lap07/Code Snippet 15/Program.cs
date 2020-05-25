using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_15
{
    class Program
    {
        double length;
        double breadth;
        public double Area(double length,double breadth)
        {
            this.length = length;
            this.breadth = breadth;
            return length * breadth;
        }
        static void Main(string[] args)
        {
            Program objProgram = new Program();
            Console.WriteLine("Area of rectangle=" + objProgram.Area(10.5, 12.5));
        }
    }
}
