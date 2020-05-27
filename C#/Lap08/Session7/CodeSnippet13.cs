using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_13
{
    class CodeSnippet13
    {
        protected const double PI = 3.4;
        protected double Radius = 14.9;
        public virtual double Area()
        {
            return PI * Radius * Radius;
        }
    }
    class Cone : CodeSnippet13 
    {
        protected double Side = 1.2;
        public override double Area()
        {
            return PI * Radius * Side;
        }

        static void Main(string[] args)
        {
            CodeSnippet13 objRunOne = new CodeSnippet13();
            Console.WriteLine("Area is:" + objRunOne.Area());
            CodeSnippet13 objRunTwo = new Cone();
            Console.WriteLine("Area is:" + objRunTwo.Area());
        }
    }
}
