using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(GolfClub.Startup))]
namespace GolfClub
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
