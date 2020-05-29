using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet_6
{
    class CodeSnippet6
    {
        interface IDetails
        {
            void GetDetails();
        }
        class Student : IDetails
        {
            string studName;
            int studID;
            public Student(string name, int num)
            {
                studName = name;
                studID = num;
            }
            public void GetDetails()
            {
                Console.WriteLine(studID + "\t" + studName);
            }
            class GenericList<T> where T : IDetails
            {
                T[] values = new T[3];
                int counter = 0;
                public void Add(T val)
                {
                    values[counter] = val;
                    counter++;
                }
                public void Display()
                {
                    for (int i = 0; i < 3; i++)
                    {
                        values[i].GetDetails();
                    }

                }
            }

            class InterfaceConstraintDemo
            {
                static void Main(string[] args)
                {
                    GenericList<Student> objList = new GenericList<Student>();
                    objList.Add(new Student("Wilson", 120));
                    objList.Add(new Student("Jack", 130));
                    objList.Add(new Student("Peter", 140));
                    objList.Display();
                }
            }
        }
    }
}
    


