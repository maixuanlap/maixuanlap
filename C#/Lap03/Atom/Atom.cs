using System;
using System.Reflection.Metadata.Ecma335;

namespace Atom
{
    class Atom
    {
        private int number;
        private string symbol;
        private string fullname;
        private float weight;
        public Atom(int number, string symbol, string fullname, float weight)
        {
            this.number = number;
            this.symbol = symbol;
            this.fullname = fullname;
            this.weight = weight;
        }
        public int Number
        {
            get { return number; }
            set { number = value; }
        }
        public string Symbol
        {
            get { return symbol; }
            set { symbol = value; }
        }
        public string Fullname
        {
            get { return fullname; }
            set { fullname = value; }
        }
        public float Weight
        {
            get { return weight; }
            set { weight = value; }
        }
        public void ToString()
        {
            Console.WriteLine("{0},{1},{2},{3}", number, symbol, fullname, weight);
        }
    }
}
