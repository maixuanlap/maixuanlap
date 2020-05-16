using System;


namespace Employee
{
    class Program
    {
        public static void Main()
        {
            Employee myEmployee;
            myEmployee = new Employee();
            Console.WriteLine("Enter firstName: ");
            myEmployee.firstName = Console.ReadLine();
            Console.WriteLine("Enter lastName: ");
            myEmployee.lastName = Console.ReadLine();
            Console.WriteLine("Enter address: ");
            myEmployee.address = Console.ReadLine();
            Console.WriteLine("Enter sin: ");
            myEmployee.sin = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter salary: ");
            myEmployee.salary = Convert.ToSingle(Console.ReadLine());

            int discount;
            Console.WriteLine("Enter discount: ");
            discount = Convert.ToInt16(Console.ReadLine());

            Console.WriteLine("========================");
            myEmployee.ToString();
            myEmployee.discountSalary(discount);
        }
    }
}