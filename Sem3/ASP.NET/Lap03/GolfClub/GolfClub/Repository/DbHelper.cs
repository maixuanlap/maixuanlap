﻿using GolfClub.DAL;
using GolfClub.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace GolfClub.Repository
{
    public class DbHelper
    {
        public Member PostMemberDetails(Member memberModel)
        {
            ClubMemberDbManager dbInstance = new ClubMemberDbManager();
            return dbInstance.CreateMember(memberModel);
        }
    }
}