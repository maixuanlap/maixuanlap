using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;

namespace Atom
{
    class Program
    {
        public static void Main(string[] args)
        {
            ArrayList arraylist = new ArrayList();

            int y = 1;
            bool status = true;
            do
            {

                //number
                string number;
                Console.WriteLine("Atomic Information");
                Console.WriteLine("==================");
                Console.WriteLine("Enter atomic number: ");
                number = Console.ReadLine();
                int checknumber;
                status = int.TryParse(number, out checknumber);
                Console.WriteLine(status);
                if (status == false)
                {
                    continue;
                }
                //symbol
                String symbol, fullname;
                Console.WriteLine("Enter symbol: ");
                symbol = Console.ReadLine();
                status = Regex.IsMatch(symbol, @"^[A-Za-z]*$");
                Console.WriteLine(status);

                if (status == false)
                {
                    continue;
                }

                Console.WriteLine("Enter full name: ");
                fullname = Console.ReadLine();
                status = Regex.IsMatch(fullname, @"^[A-Za-z]*$");
                Console.WriteLine(status);
                if (status == false)
                {
                    continue;
                }
                string weight;
                Console.WriteLine("Enter atomic weight: ");
                weight = Console.ReadLine();
                float checkweight;
                status = float.TryParse(weight, out checkweight);
                Console.WriteLine(status);
                if (status == false)
                {
                    continue;
                }
                y++;
                Console.WriteLine(y);
                Atom atom = new Atom(checknumber, symbol, fullname, checkweight);
                arraylist.Add(atom);
            } while (y <= 10);

            foreach (Atom atom1 in arraylist)
            {
                Console.WriteLine("------------------------------------");
                atom1.ToString();
            }
        }
    }
}
