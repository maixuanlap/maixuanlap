using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet8
{
    class General<T, U>
    {
        T valOne;
        U valTwo;
        public void AcceptValues(T item)
        {
            valOne = item;
        }
        public void AcceptValues(U item)
        {
            valTwo = item;
        }
        public void Display()
        {
            Console.Write(valOne + "\t" +valTwo);
        }
    }
    class MethodOverload
    {
        static void Main(string[] args)
        {
            General<int, string> objGenOne = new General<int, string>();
            objGenOne.AcceptValues(10);
            objGenOne.AcceptValues("Smith");
            Console.WriteLine("ID\tName\tDesignation\tSalary");
            objGenOne.Display();
            General<string, float> objGenTwo = new General<string, float>();
            objGenTwo.AcceptValues("Mechanic");
            objGenTwo.AcceptValues(2500);
            Console.Write("\t");
            objGenTwo.Display();
            Console.WriteLine();
        }
    }
}
