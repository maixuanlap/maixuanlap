using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_5
{
    class Program
    {
        void printMessage(String Message="Hello use!")
            {
            Console.WriteLine("{0}", Message);
            }

        static void Main(string[] args)
        {
            Program opExample = new Program();
            opExample.printMessage("Well come use!");
            opExample.printMessage();
        }
    }
}
