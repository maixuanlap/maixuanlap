using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet3
{
    class CodeSnippet3
    {
        string empName;
        int empID;
        public CodeSnippet3(string name, int num)
        {
            empName = name;
            empID = num;
        }
        public string Name
        {
            get { return empName; }
        }
        public int ID
        {
            get { return empID; }
        }

    }
    class GenericList<T> where T : CodeSnippet3
    {
        T[] name = new T[3];
        int counter = 0;
        public void Add(T val)
        {
            name[counter] = val;
            counter++;
        }
        public void Display()
        {
            for (int i = 0; i < counter; i++)
            {
                Console.WriteLine(name[i].Name + ", " +name[i].ID);
            }
        }
    }
    class ClassConstraintDemo
    {
        static void Main(string[] args)
        {
            GenericList<CodeSnippet3> objList = new
             GenericList<CodeSnippet3>();
            objList.Add(new CodeSnippet3("John", 100));
            objList.Add(new CodeSnippet3("James", 200));
            objList.Add(new CodeSnippet3("Patrich", 300));
            objList.Display();
        }
    }
}
