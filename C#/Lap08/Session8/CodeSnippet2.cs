using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet2
{
   abstract class CodeSnippet2
    {
        public void Eat()
        {
            Console.WriteLine("Every animal eats food in order to survive");
        }
        public abstract void CodeSnippet2Sound();
    }
    class Lion : CodeSnippet2
    {
        public override void CodeSnippet2Sound()
        {
            Console.WriteLine("Lion roars");
        }
        static void Main(string[] args)
        {
            Lion objLion = new Lion();
            objLion.CodeSnippet2Sound();
            objLion.Eat();
        }
    }
      
    
}
