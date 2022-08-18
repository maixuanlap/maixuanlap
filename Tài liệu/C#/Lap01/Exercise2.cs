using System;

namespace Exercise2
{
    class Exercise2
    {
        static void Main(string[] args)
        {
            int num1, num2, num3;
            Console.Write("Enter num1: ");
            num1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter num2: ");
            num2 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter num3: ");
            num3 = Convert.ToInt32(Console.ReadLine());


            if (num1 > num2)
            {
                Console.Write("So thu nhat la so lon nhat trong ba so. \n\n");
            }
            else if (num2 > num3)
            {
                Console.Write("So thu hai la so lon nhat trong ba so.\n\n");
            }
            else
            {
                Console.Write("So thu ba la so lon nhat trong ba so. \n\n");
            }
            Console.ReadKey();
        }
    }
}