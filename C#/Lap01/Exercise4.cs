using System;

namespace Exercise4
{
    class Exercise4
    {
        static void Main(string[] args)
        {
            int n, tich;
            Console.Write("Enter n: ");
            n = Convert.ToInt32(Console.ReadLine());

            for (int i = 1; i <= 9; i++)
            {
                tich = n * i;
                Console.WriteLine(n + " x " + i + " = " + tich);
            }
        }
    }
}
