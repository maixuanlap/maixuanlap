using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet15
{
    class CodeSnippet15
    {
        double length;
        double breadth;
        public double Area(double length, double breadth)
        {
            this.length = length;
            this.breadth = breadth;
            return length * breadth;
        }
        static void Main(string[] args)
        {
            CodeSnippet15 objCS15 = new CodeSnippet15();
            Console.WriteLine("Area of rectangle = " + objCS15.Area(10.5, 12.5));
        }
    }
}