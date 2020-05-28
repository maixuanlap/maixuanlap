using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrintString
{
    class PrintString
    {
        static FileStream fs;
        static StreamWriter sw;

        public delegate void printString(string s);

        public static void WriteToScreen(string str)
        {
            Console.WriteLine("The String is: {0}", str);
        }
        public static void WriteToFile(string s)
        {
            fs = new FileStream("c:\\message.txt", FileMode.Append, FileAccess.Write);
            sw = new StreamWriter(fs);
            sw.WriteLine();
            sw.Flush();
            sw.Close();
            fs.Close();
        }

        public static void sendString(printString ps)
        {
            ps("Hello World");
        }
        static void Main(string[] args)
        {
            printString ps1 = new printString(WriteToScreen);
            printString ps2 = new printString(WriteToFile);
            sendString(ps1);
            sendString(ps2);
            Console.ReadKey();
        }
    }
}

