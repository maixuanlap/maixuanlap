using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_4
{
    class Program
    {
       void Count(int boys,int girls)
        {
            Console.WriteLine(boys + girls);
        }
        static void Main(string[] args)
        {
            Program objTest = new Program();
            objTest.Count(boys: 16, girls: 24);

        }
    }
}
