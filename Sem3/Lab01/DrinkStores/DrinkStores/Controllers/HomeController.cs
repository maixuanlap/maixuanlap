using Microsoft.AspNetCore.Mvc;
using DrinkStores.Models;

namespace DrinkStore.Controllers
{
    public class HomeController : Controller
    {
        private IStoreRepository repository;
        public HomeController(IStoreRepository repo)
        {
            repository = repo;
        }
        
        public IActionResult Index() => View(repository.Products);

    }
}
