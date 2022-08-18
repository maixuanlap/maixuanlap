@extends('layouts.default')
@section('title','Trang chủ')
@section('css','css/home.css')
@section('content')
    <section class="slider">
        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleFade" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleFade" data-slide-to="1"></li>
                <li data-target="#carouselExampleFade" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100 img-slide" src="{{asset('img/VNA_Herobanner_TravelSmart-vi.png')}}" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100 img-slide" src="img/CON%20DAO%202600X1111.jpg" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100 img-slide" src="img/2600x1111_cashless.png" alt="Third slide">
                </div>
            </div>
        </div>
    </section>
    <section class="content">
        <div class="container">
            <div class="col-md-12 list-button">
                <div class="button-header">
                    <div class="row">
                        <a class="btn btn-primary col-md-3" href="chuyenbay" role="button"><i class="fas fa-ticket-alt"></i> Mua vé</a>
                        <a class="btn btn-primary col-md-3" href="tintuc" role="button"><i class="fas fa-clipboard-list"></i> Tin tức</a>
                        <a class="btn btn-primary col-md-3" href="trangthai" role="button"><i class="fas fa-clock"></i> Trạng thái chuyến bay</a>
                        <a class="btn btn-primary col-md-3" href="huyve" role="button"><i class="fas fa-calendar-times"></i> Hủy vé</a>
                    </div>
                </div>
            </div>

            <div class="col-12 deal-head">
                <h3>Ưu đãi mới nổi bật</h3>
            </div>
            <div class="hot-deal ">
                <div class="hot-image">
                    <img src="img/600x308%2520(1).png">
                </div>
                <div class="hot-des">
                    <h3 class="title-sm-blue">
                        <strong>Combo ưu đãi VNAHolidays</strong>
                    </h3>
                    <div class="hot-middle">
                        <div class="hot-middle-col">
                            <span>Vé máy bay & Khách sạn</span>
                        </div>
                        <div class="hot-middle-col">
                            <span>3 ngày 2 đêm/người</span>
                            <h5 class="title-sm-yellow">VND 1.750.000</h5>
                        </div>
                    </div>
                    <a class="btn-yellow" href="#">CHI TIẾT</a>
                </div>
            </div>
            <div ><a href="/Uudai" class="btn-deal">Xem tất cả các ưu đãi</a></div>
        </div>
    </section>

    <section class="content-city">
        <div class="container">
            <div class="col-12 home-fare-title">
                <h2>Giá vé ưu đãi</h2>
            </div>

            <div class="col-md-6 col-12 col-promotions medium">
                <div class="img-overlay box-destination overlay" style="background-image: url(img/VCS.jpg);">
                    <div class="description">
                        <p class="city">Côn Đảo</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">1.526.000 VND </p>
                        <p class="title-price">(2.499.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6 col-12 col-promotions medium">
                <div class="img-overlay box-destination" style="background-image: url(img/DLI.jpg);">
                    <div class="description">
                        <p class="city">Đà Lạt</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">1.526.000 VND </p>
                        <p class="title-price">(2.499.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6 col-12 col-promotions medium">
                <div class="img-overlay box-destination" style="background-image: url(img/VCA.png);">
                    <div class="description">
                        <p class="city">Nha Trang</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">1.526.000 VND </p>
                        <p class="title-price">(2.499.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6 col-12 col-promotions medium">
                <div class="img-overlay box-destination" style="background-image: url(img/UIH.png);">
                    <div class="description">
                        <p class="city">Quy Nhơn</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">199.000 VND </p>
                        <p class="title-price">(2.499.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6 col-12 col-promotions">
                <div class="img-overlay box-destination" style="background-image: url(img/HUI.jpg);">
                    <div class="description">
                        <p class="city">Huế</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">1.526.000 VND </p>
                        <p class="title-price">(2.499.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6 col-12 col-promotions medium">
                <div class="img-overlay box-destination" style="background-image: url(img/VDH.png);">
                    <div class="description">
                        <p class="city">Đồng Hới</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">199.000 VND </p>
                        <p class="title-price">(689.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>

            <div class="col-md-6 col-12 col-promotions medium">
                <div class="img-overlay box-destination" style="background-image: url(img/PXU.jpg);">
                    <div class="description">
                        <p class="city">Pleiku</p>
                        <p class="date-book">Mua vé trước 31/12/2020</p>
                        <p class="title-price">Giá một chiều từ</p>
                        <p class="price">199.000 VND </p>
                        <p class="title-price">(689.000 VND gồm thuế, phí)</p>
                        <a href="chuyenbay" class="btn-book">MUA VÉ</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="info-new">
        <div class="container new-content">
            <div class="col-12 home-fare-title">
                <h2>Thông tin nổi bật</h2>
            </div>
            <div class="col-md-4 card-info">
                <div class="card">
                    <a href="/">
                        <img class="card-img-top" src="img/to-bay-vn.png" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Lich bay nội địa (cập nhật)</h5>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-md-4 card-info">
                <div class="card">
                    <a href="/">
                        <img class="card-img-top" src="img/In-flight-service.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Dịch vụ trên không</h5>
                        </div>
                    </a>
                </div>
            </div>

            <div class="col-md-4 card-info">
                <div class="card">
                    <a href="/">
                        <img class="card-img-top" src="img/Lotus-lounge.png" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Phòng khách bông sen</h5>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>
@endsection
