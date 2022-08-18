using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet5
{
    class CodeSnippet5
    {
        void printMessage(String message = "Hello user!")
        {
            Console.WriteLine("{0}", message);
        }
        static void Main(string[] args)
        {
            CodeSnippet5 objCS5 = new CodeSnippet5();
            objCS5.printMessage("Welcome User!");
            objCS5.printMessage();
        }
    }
}