using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_11
{
    class CodeSnippet11
    {
        public virtual void Print()
        {
            Console.WriteLine("The system should be handled carefully");
        }

    }
    class CompanySystem : CodeSnippet11
    {
        public override sealed void Print()
        {
            Console.WriteLine("The system information is confidential");
            Console.WriteLine("This information should not be overridden");
        }
    }
    class SealedSystem : CompanySystem
    {
        public override void Print()
        {
            Console.WriteLine("This statement won't get executed");
        }
        static void Main(string[] args)
        {
            SealedSystem objSealed = new SealedSystem();
            objSealed.Print();
        }
    }
}
