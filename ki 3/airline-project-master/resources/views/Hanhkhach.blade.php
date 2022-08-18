@extends('layouts.default')
@section('title','Thông Tin Hành Khách')
@section('css','css/thongtin.css')
@section('content')
    <section class="parallax">
        <div>
            <h1>THÔNG TIN</h1>
        </div>
        <div class="content">
            <div class="container">
                <div class="row">
                    <div class="contents col-md-12">
                        <div class="tab col-md-12">
                            <button  class="tablinks active">Thông tin cá nhân</button>
                        </div>
                        <div id="Thông tin cá nhân" class="tabcontent">
                            <form class="row col-md-12" method="post" action="/hanhkhachstore">
                                @csrf
                                <div class="col-md-4">
                                    <h3><span>Thông tin cá nhân</span></h3>
                                    <p>Qúy khách nhập đúng thông tin trong hộ chiếu/Chứng minh nhân dân/
                                        Căn cước công dân.</p>
                                </div>
                                <div class="col-md-8">


                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Họ</span>
                                        </p>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control" id="ho" name="ho" placeholder="Họ" required>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Đệm và Tên</span>
                                        </p>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control"id="ten" name="ten" placeholder="Tên" required>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Giới tính</span>
                                        </p>
                                        <div class="col-md-8">
                                            <select class="custom-select my-1 mr-sm-2" id="gioi_tinh" name="gioi_tinh">
                                                <option selected>Chọn</option>
                                                <option value="1">Nam</option>
                                                <option value="2">Nữ</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Ngày sinh</span>
                                        </p>
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <input class="form-control" type="date" id="ngay_sinh" name="ngay_sinh" required>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Di động</span>
                                        </p>
                                        <div class="col-md-8">
                                                    <input type="text" class="form-control"id="sdt" name="sdt" placeholder="Số điện thoại" required>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Địa chỉ</span>
                                        </p>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control"  name="diachi" placeholder="Địa chỉ" required>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <p class="col-md-4 padding10">
                                            <span>Số CMND</span>
                                        </p>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control"  name="cmnd" placeholder="Nhập CMND" required>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <p class="col-md-4 ">
                                            <span>Địa chỉ thư điện tử</span>
                                        </p>
                                        <div class="col-md-8">
                                            <input type="text" class="form-control"id="email" name="email"  placeholder="Nhập email" required>
                                        </div>
                                    </div>

                                </div>
                                <div class="col-md-12">
                                    <input class="btn btn-primary" type="submit" value="Tiếp tục">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
@endsection
