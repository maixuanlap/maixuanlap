using Lap10.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace Lap10
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
      
         private ObservableCollection<FoodItem> FoodItems;
         public MainPage()
        {
            this.InitializeComponent();
            FoodItems = new ObservableCollection<FoodItem>();
        }

        private void HumburgerButton_Click(object sender, RoutedEventArgs e)
        {
            MySplitView.IsPaneOpen = !MySplitView.IsPaneOpen;
        }

        private void ListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (MainDishes.IsSelected)
            {
                FoodManager.GetFoods("Main dishes", FoodItems);
                TitleTextBlock.Text = "Financial";
            }
            else if (Desserts.IsSelected)
            {
                FoodManager.GetFoods("Desserts", FoodItems);
                TitleTextBlock.Text = "Desserts";
            }
        }
        private void Page_Loaded(object sender, RoutedEventArgs e)
        {
            MainDishes.IsSelected = true;
        }
    }
}
