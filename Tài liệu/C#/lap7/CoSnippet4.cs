using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet4
{
    class CodeSnippet4
    {
        void Count(int boys, int girls)
        {
            Console.WriteLine(boys + girls);
        }
        static void Main(string[] args)
        {
            CodeSnippet4 objCS4 = new CodeSnippet4();
            objCS4.Count(boys: 16, girls: 24);
        }
    }
}