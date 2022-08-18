using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet10
{
    class Department : IEnumerable
    {
        string[] departmentNames = { "Marketing", "Finance", "InformationTechnology", "Human Resources" };
        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < departmentNames.Length; i++)
            {
                yield return departmentNames[i];
            }
        }
        static void Main(string[] args)
        {
            Department objDepartment = new Department();
            Console.WriteLine("Department Names");
            Console.WriteLine();
            foreach (string str in objDepartment)
            {
                Console.WriteLine(str);
            }
        }
    }
}
