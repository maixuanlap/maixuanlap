@extends('layouts.default')
@section('title','Mua Vé')
@section('css','css/Muave.css')
@section('content')
    <section class="parallax">
        <div class="container">
            @if(count($flights)>0)
            <div class="hh col-md-12 mt-3">
                <h2 class="text-center">Chọn chuyến bay</h2>
                <div class = "content-table">
                    <div class="content">
                        <form method="post" action="/storeprice">
                            @csrf
                            <div class="table-responsive table-bordered text-center">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th scope="col">Máy bay</th>
                                        <th scope="col">Chuyến bay</th>
                                        <th scope="col">Thời gian</th>
                                        <th scope="col">Hạng phổ thông</th>
                                        <th scope="col">Hạng thương gia</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    @foreach($flights as $flight)
                                            <tr>
                                                <input type="hidden" name="id" value="{{$flight->id}}">
                                                <th scope="row">{{$flight->ten}}</th>
                                                <td>
                                                    <div class="flight-from float-left">
                                                        <span class="time-from">{{$flight->giodi}}</span><br/>
                                                        {{$flight->noidi}}
                                                    </div>
                                                    <span class="float-left"><i class="fas fa-plane m-2"></i></span>
                                                    <div class="flight-to float-left">
                                                        <span class="time-to">{{$flight->gioden}}</span><br/>
                                                        {{$flight->noiden}}</div>
                                                </td>
                                                <td>{{$flight->thoigian}}</td>
                                                <td class="price-normal">
                                                    <div class="form-group">
                                                        <div class="radio">
                                                            <label>
                                                                <input type="radio" name="radio" value="{{$flight->pho_thong}}" required style="height: 18px; width: 18px;vertical-align: middle;">
                                                                Chọn chuyến bay
                                                            </label>
                                                        </div>
                                                        <h5 class="flight-price">{{number_format($flight->pho_thong,0,',',',')}} VND</h5>
                                                        <span class="flight-seat">Chuyến bay này còn {{$flight->soghe}} chỗ</span>
                                                    </div>
                                                </td>
                                                <td class="price-vip">
                                                    <div class="form-group">
                                                        <div class="radio">
                                                            <label>
                                                                <input type="radio" name="radio" value="{{$flight->thuong_gia}}" required style="height: 18px; width: 18px;vertical-align: middle;">
                                                                Chọn chuyến bay
                                                            </label>
                                                        </div>
                                                        <h5 class="flight-price">{{number_format($flight->thuong_gia,0,',',',')}} VND</h5>
                                                        <span class="flight-seat">Chuyến bay này còn {{$flight->soghe}} chỗ</span>
                                                    </div>
                                                </td>
                                            </tr>

                                    @endforeach
                                    </tbody>
                                </table>
                                <input class="btn btn-primary" type="submit" value="Tiếp tục">
                            </div>
                        </form>
                        @else
                            <div class="buy-none">
                                <div class="none-content">
                                    <div class="text-center">
                                        <h1 class="text-center">Không tìm thấy chuyến bay nào</h1>
                                        <a class="btn-search" href="chuyenbay" role="button">Tìm ngày khác</a>
                                    </div>
                                </div>
                            </div>
                            @endif
                    </div>
                </div>
            </div>
        </div>
    </section>
@endsection
