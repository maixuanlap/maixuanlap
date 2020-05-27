using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExHandling3
{
    class ExHandling3
    {
        public static int AnExceptionFunction(int value)
        {
            if (value == 0)
                throw new DivideByZeroException("Divide By 0 error!");
            int x = 20 / value;
            return x;
        }
        public static void Main()
        {
            int value = 0;
            try
            {
                value = AnExceptionFunction(10);
                Console.WriteLine("Value={0}", value);
                AnExceptionFunction(0);
                Console.WriteLine("Value={0}", value);
            }
            catch (Exception e)
            {
                Console.WriteLine("Caught an exception {0}. Continuing", e);
            }
            Console.ReadLine();
        }
    }
}
