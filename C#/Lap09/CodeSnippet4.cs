using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet4
{
    class CodeSnippet4
    {
        static void Swap<T>(ref T valOne, ref T valTwo)
        {
            T temp = valOne;
            valOne = valTwo;
            valTwo= temp;
        }
        static void Main(string[] args)
        {
            int numOne = 23;
            int numTwo = 45;
            Console.WriteLine("Values before swapping: " + numOne + " & " + numTwo);
                Swap<int>(ref numOne, ref numTwo);
            Console.WriteLine("Values after swapping: " + numOne + " & " + numTwo);
        }
    }
}
