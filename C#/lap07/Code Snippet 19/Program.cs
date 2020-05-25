using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Principal;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_19
{
   public class Program
    {
        double length;
        double breadth;
        public Program()
        {
            length = 13.5;
            breadth = 20.5;
        }
        public Program(double len,double wide)
        {
            length = len;
            breadth = wide;
        }
        public double Area()
        {
            return length * breadth;
        }
        static void Main(string[] args)
        {
            Program objRect1 = new Program();
            Console.WriteLine("Area of program=" + objRect1.Area());
            Program objRect2 = new Program(2.5, 6.9);
            Console.WriteLine("Area of prgram=" + objRect2.Area());
        }
    }
}
