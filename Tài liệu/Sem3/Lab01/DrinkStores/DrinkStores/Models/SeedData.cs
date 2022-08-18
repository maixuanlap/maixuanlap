using Microsoft.AspNetCore.Builder;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


namespace DrinkStores.Models
{
    public static class SeedData
    {
        public static void EnsurePopulated(IApplicationBuilder app)
        {
            StoreDbContext context = app.ApplicationServices
                .CreateScope().ServiceProvider.GetRequiredService<StoreDbContext>();

            if (context.Database.GetPendingMigrations().Any())
            {
                context.Database.Migrate();
            }

            if (!context.Products.Any())
            {
                context.Products.AddRange(
                    new Product
                    {
                        Name = "Coffe",
                        Description = "The drink is very good quality",
                       
                        Price = 20,
                        Discount = 5,
                        Status = "The drink is very good quality"
                    },
                    new Product
                    {
                        Name = "Sinh Tố",
                        Description = "Sinh tố xoài",
                      
                        Price = 25,
                        Discount = 10,
                        Status = "The drink is very good quality"
                    },
                    new Product
                    {
                        Name = "Kayak",
                        Description = "The drink is very good quality",
                     
                        Price = 35,
                        Discount = 15,
                        Status = "The drink is very good quality"
                    },
                    new Product
                    {
                        Name = "Kayak",
                        Description = "The drink is very good quality",
              
                        Price = 30,
                        Discount = 20,
                        Status = "The drink is very good quality"
                    },
                    new Product
                    {
                        Name = "Kayak",
                        Description = "The drink is very good quality",
                       
                        Price = 50,
                        Discount = 25 ,
                        Status = "The drink is very good quality"
                    }
                );
                context.SaveChanges();
            }
        }
    }
}
