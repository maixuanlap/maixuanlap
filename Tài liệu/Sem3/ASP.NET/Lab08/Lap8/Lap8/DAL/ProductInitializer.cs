using Lap8.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Lap8.DAL
{
    public class ProductInitializer : System.Data.Entity.DropCreateDatabaseIfModelChanges<ProductContext>
    {


        protected override void Seed(ProductContext context)
        {
            var products = new List<Product>
            {
                new Product{ProductName="planes",Qty=5,Price=10},
                new Product{ProductName="Phone",Qty=30,Price=45},
                new Product{ProductName="Card",Qty=15,Price=3.5},
                new Product{ProductName="boat",Qty=5,Price=13},
            };
            products.ForEach(s => context.Products.Add(s));
            context.SaveChanges();
            var categorys = new List<Category>
            {
                new Category{CategoryID=1,Title="Calculus",ProductID=1},
                new Category{CategoryID=2,Title="Trigonometry",ProductID=2,},
                new Category{CategoryID=3,Title="Composition",ProductID=3,},
                new Category{CategoryID=4,Title="Literature",ProductID=4,},

            };
            categorys.ForEach(s => context.Categorys.Add(s));
            context.SaveChanges();
        }
    }
}

