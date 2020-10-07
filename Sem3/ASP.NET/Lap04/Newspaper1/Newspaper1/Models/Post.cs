﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Newspaper1.Models
{
    public partial class Post
    {
        public int PostId { get; set; }
        public int NewsId { get; set; }
        public string Content { get; set; }
        public string Title { get; set; }

        public News News { get; set; }
    }
}