
<!doctype html>
<html class="no-js h-100" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Add New Product</title>
    <meta name="description" content="A high-quality &amp; free Bootstrap admin dashboard template pack that comes with lots of templates and components.">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" id="main-stylesheet" data-version="1.1.0" href="styles/shards-dashboards.1.1.0.min.css">
    <link rel="stylesheet" href="styles/extras.1.1.0.min.css">
    <script async defer src="https://buttons.github.io/buttons.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/quill/1.3.6/quill.snow.css"> </head>
<body class="h-100">
<div class="container-fluid">
    <div class="row">
        <aside class="main-sidebar col-12 col-md-3 col-lg-2 px-0">
            <div class="nav-wrapper">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="addphone.jsp">
                            <i class="material-icons">note_add</i>
                            <span>Add New Product</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="home">
                            <i class="material-icons">table_chart</i>
                            <span>Tables</span>
                        </a>
                    </li>
                </ul>
            </div>
        </aside>
        <main class="main-content col-lg-10 col-md-9 col-sm-12 p-0 offset-lg-2 offset-md-3">
            <div class="main-navbar sticky-top bg-white">
                <nav class="navbar align-items-stretch navbar-light flex-md-nowrap p-0">
                    <nav class="nav">
                        <a href="#" class="nav-link nav-link-icon toggle-sidebar d-md-inline d-lg-none text-center border-left" data-toggle="collapse" data-target=".header-navbar" aria-expanded="false" aria-controls="header-navbar">
                            <i class="material-icons">&#xE5D2;</i>
                        </a>
                    </nav>
                </nav>
            </div>
            <div class="main-content-container container-fluid px-4">
                <div class="page-header row no-gutters py-4">
                    <div class="col-12 col-sm-4 text-center text-sm-left mb-0">
                        <h3 class="page-title">Add New Product</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-9 col-md-12">
                        <div class="card card-small mb-3">
                            <div class="card-body">
                                <form class="addphone" method="post" action="home">
                                    <input class="form-control form-control-lg mb-3" type="text" placeholder="Name Phone" name="name">
                                    <input class="form-control form-control-lg mb-3" type="text" placeholder="Price" name="price">
                                    <input class="form-control form-control-lg mb-3" type="text" placeholder="Description" name="description">
                                    <select class="form-control form-control-lg mb-3" id="cars" name="brand">
                                        <option value="apple">Apple</option>
                                        <option value="samsung">Samsung</option>
                                        <option value="nokia">Nokia</option>
                                        <option value="others">Others</option>
                                    </select><br/>
                                    <input class="btn btn-primary" style="float: right" type="submit" value="Submit">
                                </form>
                                <button>
                                    <a href="addphone.jsp">Reset</a>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>
</body>
</html>
