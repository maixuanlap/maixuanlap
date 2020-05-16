using System;
using System.Collections.Generic;
using System.Text;

namespace Employee
{
    class Employee
    {
        public string firstName;
        public string lastName;
        public string address;
        public long sin;
        public double salary;
        public void discountSalary(int discount)
        {
            Console.WriteLine("Discount Salary:" + salary * discount / 100);
        }
        public override string ToString()
        {
            Console.WriteLine("FistName:" + firstName);
            Console.WriteLine("LastName:" + lastName);
            Console.WriteLine("Address:" + address);
            Console.WriteLine("Sin:" + sin);
            Console.WriteLine("Salary:" + salary);

            return base.ToString();
        }
    }
}
