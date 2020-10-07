﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Newspaper1.Models
{
    public partial class News
    {
        public News()
        {
            Post = new HashSet<Post>();
        }

        public int NewsId { get; set; }
        public string Sections { get; set; }

        public ICollection<Post> Post { get; set; }
    }
}