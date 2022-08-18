using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_12
{
    class CodeSnippet12
    {
        static int CalculateAre(int len, int wide)
        {
            return len * wide;
        }
        static double CalculateAre(double valOne,double valTwo)
        {
            return 0.5 * valOne * valTwo;
        }
        static void Main(string[] args)
        {
            int length = 10;
            int breadth = 22;
            double tbase = 2.5;
            double theight = 1.5;
            Console.WriteLine("Area of Rectangle:" + CalculateAre(length, breadth));
            Console.WriteLine("Area of triangle:" + CalculateAre(tbase, theight));
        }
    }
}
