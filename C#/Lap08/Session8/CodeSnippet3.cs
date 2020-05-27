using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Code_Snippet3
{
    class CodeSnippet3:TimeZone
    {
        public override string DaylightName
        {
            get { throw new Exception("The method or operation is not implemented."); }
        }
        public override System. Globalization.DaylightTime GetDaylightChanges(int Year)
        {
            throw new Exception("The method or operation is not implemented.");
        }
        public override TimeSpan GetUtcOffset(DateTime time)
        {
            throw new Exception("The method or operation is not implemented.");
        }
        public override string StandardName
        {
            get
            {
                throw new Exception("The method or operation is not mplemented.");
            }
        }
    }
}
