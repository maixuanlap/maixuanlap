<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/05/2021
  Time: 3:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html class="no-js h-100" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Table Product</title>
    <meta name="description" content="A high-quality &amp; free Bootstrap admin dashboard template pack that comes with lots of templates and components.">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" id="main-stylesheet" data-version="1.1.0" href="styles/shards-dashboards.1.1.0.min.css">
    <link rel="stylesheet" href="styles/extras.1.1.0.min.css">
</head>

<body class="h-100">
<div class="container-fluid">
    <div class="row">
        <!-- Main Sidebar -->
        <aside class="main-sidebar col-12 col-md-3 col-lg-2 px-0">

            <div class="nav-wrapper">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link " href="addphone.jsp">
                            <i class="material-icons">note_add</i>
                            <span>Add New Product</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="home">
                            <i class="material-icons">table_chart</i>
                            <span>Tables</span>
                        </a>
                    </li>
                </ul>
            </div>
        </aside>
        <main class="main-content col-lg-10 col-md-9 col-sm-12 p-0 offset-lg-2 offset-md-3">
            <div class="main-navbar sticky-top bg-white">
                <!-- Main Navbar -->
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
                        <h3 class="page-title">Data Tables</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="card card-small mb-4">
                            <div class="card-header border-bottom">
                                <h6 class="m-0">Products</h6>
                            </div>
                            <div class="card-body p-0 pb-3 text-center">
                                <table class="table mb-0 text-center">
                                    <thead class="bg-light">
                                    <tr>
                                        <th scope="col" class="border-0">#</th>
                                        <th scope="col" class="border-0">Name</th>
                                        <th scope="col" class="border-0">Image</th>
                                        <th scope="col" class="border-0">Price</th>
                                        <th scope="col" class="border-0">Quantity</th>
                                    </tr>
                                    </thead>
                                    <c:forEach var="p" items="${requestScope.products}">
                                        <tbody>
                                        <tr>
                                            <td style="padding-top:45px">${p.id}</td>
                                            <td style="padding-top:45px">${p.name}</td>
                                            <td>
                                                <img src="${p.image}" height="100" width="150">
                                            </td>
                                            <td style="padding-top:45px">${p.price}</td>
                                            <td style="padding-top:45px">${p.quantity}</td>
                                        </tr>
                                        </tbody>
                                    </c:forEach>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script>
                function showMess(id) {
                    var option = confirm('are you sure to delete');
                    if(option === true){
                        window.location.href = 'delete?sid=' + id;
                    }
                }
            </script>
        </main>
    </div>
</div>
</body>
</html>
