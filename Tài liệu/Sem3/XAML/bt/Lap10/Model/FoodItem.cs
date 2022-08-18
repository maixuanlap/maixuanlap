using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lap10.Model
{
   public class FoodItem
    {
        public int Id { get; set; }

        public string Category { get; set; }

        public string Title { get; set; }

        public string Image { get; set; }
    }
    public class FoodManager
    {
        public static void GetFoods(string category, ObservableCollection<FoodItem> foodItems)
        {
            var allItems = getFoodItems();

            var filteredFoodItems = allItems.Where(p => p.Category == category).ToList();

            foodItems.Clear();

            filteredFoodItems.ForEach(p => foodItems.Add(p));
        }

        private static List<FoodItem> getFoodItems()
        {
            var items = new List<FoodItem>();

            items.Add(new FoodItem() { Id = 1, Category = "MainDishes", Title = "Món Ngon", Image = "Assets/anh1.jpg" });
            items.Add(new FoodItem() { Id = 2, Category = "MainDishes", Title = "Món Ngon", Image = "Assets/anh2.jpg" });
            items.Add(new FoodItem() { Id = 3, Category = "MainDishes", Title = "Món Ngon",Image = "Assets/anh2.jpg" });

            items.Add(new FoodItem() { Id = 4, Category = "Desserts", Title = "Món Ngon", Image = "Assets/anh2.jpg" });
            items.Add(new FoodItem() { Id = 5, Category = "Desserts", Title = "Món Ngon", Image = "Assets/anh2.jpg" });
            return items;
        }
    }

}