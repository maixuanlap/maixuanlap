@extends('layouts.default')
@section('title','Hủy Vé')
@section('css','css/huyve.css')
@section('content')
    <section class="parallax">
        <div class="huyve">
            <span>HỦY VÉ</span>
        </div>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="contents col-md-12">
                        <div id="Thông tin cá nhân" class="tabcontent">
                            <form class="row col-md-12">
                                <div class="row col-md-12">
                                    <div class="wrap">
                                        <div class="ticket_code">
                                            <span>Mã số vé</span>
                                        </div>
                                        <div class="search">
                                            <input type="text" class="searchTerm" id="ma so"name="ma so" placeholder="Nhập mã số vé">
                                            <button type="submit" class="searchButton" id="">
                                                <i class="fa fa-search"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>

                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Số vé</th>
                                        <th>Tên khách</th>
                                        <th>Hành trình</th>
                                        <th>Ngày đi</th>
                                        <th>Tổng tiền</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Hà Nội - HCM</td>
                                        <td>17/7/2020</td>
                                        <td>19000</td>
                                    </tr>
                                    </tbody>
                                </table>
                                <div class="col-md-12">
                                    <button class="btn submit-btn" type="submit">HỦY VÉ</button>
                                </div>
                            </form>
                    </div>
                    </div>

                </div>
            </div>
        </div>
        </div>
        </div>
    </section>
@endsection
