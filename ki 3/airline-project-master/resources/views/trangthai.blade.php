@extends('layouts.default')
@section('title','Trang Thái')
@section('css','css/trangthai.css')
@section('content')
    <section class="parallax">
        <div class="head" >
            <h3> Chuyến bay</h3>
        </div>
        <div class="container">
            <div class="row box1">
                <table class="table table-striped text-center">
                    <thead>
                    <tr>
                        <th scope="col">Máy bay</th>
                        <th scope="col">Thời gian khởi hành</th>
                        <th scope="col">Thời gian đến</th>
                        <th scope="col">Điểm xuất phát</th>
                        <th scope="col">Điểm đến</th>
                    </tr>
                    </thead>
                    <tbody>
                    @foreach($chuyenbay as $cb)
                    <tr>
                        <td>{{$cb->ten}}</td>
                        <td>{{$cb->giodi}}</td>
                        <td>{{$cb->gioden}}</td>
                        <td>{{$cb->noidi}}</td>
                        <td>{{$cb->noiden}}</td>
                    </tr>
                    @endforeach
                    </tbody>
                </table>
            </div>
        </div>
    </section>
@endsection
