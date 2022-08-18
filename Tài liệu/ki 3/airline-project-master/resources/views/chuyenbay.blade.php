@extends('layouts.default')
@section('title','Chuyến Bay')
@section('css','css/chuyenbay.css')
@section('content')
    <div id="booking" class="section">
        <div class="section-center">
            <div class="container">
                <form method="get" action="/Muave" class="booking-form">
                    {{ csrf_field() }}
                    <h4>Tìm chuyến bay</h4>
                    <div class="form-group">
                        <div class="form-checkbox">
                            <label for="roundtrip">
                                <input type="radio" id="roundtrip" name="flight-type">
                                <span></span>Một chiều
                            </label>
                            <label for="one-way">
                                <input type="radio" id="one-way" name="flight-type">
                                <span></span>Khứ hồi
                            </label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <span class="form-label"><i class="fas fa-map-marker-alt"></i> Điểm đi</span>
                                <select class="form-control" type="date" name="diemdi" id="diemdi">
                                    <option value="Hà Nội">Hà Nội</option>
                                    <option value="Đà Lạt">Đà Lạt</option>
                                    <option value="Phú Quốc">Phú Quốc</option>
                                    <option value="Cà Mau">Cà Mau</option>
                                    <option value="TP. Hồ Chí Minh">TP Hồ Chí Minh</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <span class="form-label"><i class="fas fa-map-marker-alt"></i> Điểm đến</span>
                                <select class="form-control" type="date" required name="diemden" id="diemden">
                                    <option value="Hà Nội">Hà Nội</option>
                                    <option value="Đà Nẵng">Đà Nẵng</option>
                                    <option value="Phú Quốc">Phú Quốc</option>
                                    <option value="TP. Hồ Chí Minh">TP Hồ Chí Minh</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <span class="form-label"><i class="fas fa-calendar-day"></i> Ngày đi</span>
                                <input class="form-control" type="date" required name="ngaydi" id="ngaydi">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-9">
                        </div>
                        <div class="col-md-3">
                            <div class="form-btn">
                                <button  class="submit-btn" type="submit">Tìm chuyến bay</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
@endsection
