using GolfClub.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace GolfClub.DAL
{
    public class GolfClubContext : DbContext
    {
        public DbSet<Member> Members { get; set; }
    }
}