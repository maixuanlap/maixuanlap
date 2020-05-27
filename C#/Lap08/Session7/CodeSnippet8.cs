﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_8
{
    class CodeSnippet8
    {
        public virtual void Eat()
        {
            Console.WriteLine("Every animal eats something");
        }
        protected void DoSomething()
        {
            Console.WriteLine("Every animal does something");
        }
    }
    class Cat : CodeSnippet8
    {
        public override void Eat()
        {
            Console.WriteLine("Cat loves to eat the mouse");
        }
        static void Main(string[] args)
        {
            Cat objCat = new Cat();
            objCat.Eat();
        }
    }
 }
       
    