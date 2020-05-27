using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exe2
{
    public class InvalidInput : ApplicationException
    {
        public InvalidInput() : base("Enter less than 60,000 salary") { }

    }
    public class InvalidBonus : ApplicationException
    {
        public InvalidBonus() : base("Enter more than 10,000") { }
    }
    class TestExcep
    {
        public static void Main()
        {
            double Salary;
            int intSalary, bonusSalary = 0;
            Console.WriteLine("Enter salary :");
            try
            {
                intSalary = Convert.ToInt32(Console.ReadLine());
                if (intSalary >= 60000)
                {
                    throw new InvalidInput();
                }
            }
            catch (InvalidInput objInvalidInput)
            {
                Console.WriteLine(objInvalidInput.Message);
            }
            catch (System.FormatException objFormatException)
            {
                Console.WriteLine(objFormatException.Message);
            }
            Console.WriteLine("Enter bonusSalary :");
            try
            {
                bonusSalary = Convert.ToInt32(Console.ReadLine());
                if (bonusSalary >= 10000)
                {
                    throw new InvalidBonus();
                }
            }
            catch (InvalidBonus objInvalidBonus)
            {
                Console.WriteLine(objInvalidBonus.Message);
            }
            catch (System.FormatException objFormatException)
            {
                Console.WriteLine(objFormatException.Message);
            }

            Console.ReadLine();
        }
    }
}
