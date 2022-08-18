@extends('layouts.default')
@section('title','Thanh toán')
@section('css','css/thanhtoan.css')
@section('content')
    <form method="post" action="/storecard">
        @csrf
    <section class="box">
    <div class="container">
        <div class="row">
            <div class="bo">
                <b>Lưu ý :</b>
                <p>Vietnam Airlines đặt trụ sở tại Việt Nam. Tùy theo chính sách của mình, ngân hàng phát hành thẻ có
                    thể thu phí trên mỗi giao dịch của Quý khách. Vietnam Airlines tuyệt đối không chịu
                    trách nhiệm khi phát sinh bất kỳ khoản phí nào liên quan đến việc sử dụng thẻ để thanh toán tại
                    website của Vietnam Airlines. Quý khách nên trực tiếp liên hệ với ngân hàng phát hành
                    thẻ để có đầy đủ thông tin về chi phí phát sinh.</p>
            </div>
                <div class="boc1 col-md-12">
                    <div class="box5">
                        <h3 class="thanhtoan">Chọn hình thức thanh toán</h3>
                        <p>Quý khách lựa chọn hình thức thanh toán dưới đây</p>
                    </div>
                        <hr class="my-2">
                        <div class="box4">
                            <div class="col-md-3 float-left">
                                <label>
                                    <input type="radio" name="radio" value="visa" checked>
                                    <img src="img/tai2.png">
                                </label>
                            </div>
                            <div class="col-md-3 float-left">
                                <label>
                                    <input type="radio" name="radio" value="master">
                                    <img src="img/tai1.png">
                                </label>
                            </div>
                            <div class="col-md-3 float-left">
                                <label>
                                    <input type="radio" name="radio" value="american express">
                                    <img src="img/tai.png">
                                </label>
                            </div>
                            <div class="col-md-3 float-left">
                                <label>
                                    <input type="radio" name="radio" value="discover">
                                    <img src="img/tai3.png">
                                </label>
                            </div>
                        </div>
                        <div class="clearfix"></div>
                        <div class="box1">
                            <p>Lưu ý: * Trường bắt buộc nhập thông tin</p>
                            <div class="col-md-4 float-left owner">
                                <label for="owner">Tên chủ thẻ*</label><br/>
                                <input class="form-control" type="text" name="ten" placeholder="Tên chủ thẻ">
                            </div>
                            <div class="col-md-4 float-left cardd">
                                <label for="cardNumber">Số thẻ*</label><br/>
                                <input class="form-control" type="text" name="sothe" placeholder="nhập số thẻ">
                            </div>
                            <div class="col-md-4 float-left time">
                                <div class="form-group">
                                    <label for="hsd">Hạn sử dụng</label><br/>
                                    <input class="form-control" id="hsd" type="date" name="hsd" required>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="box3">
                            <h5>Điều kiện thay đổi/hoàn vé</h5>
                            <p>Quý khách vui lòng xem các thông tin chi tiết dưới đây.</p>
                        </div>
                        <hr class="my-4">
                        <div class="box2">

                            <h6>Điều kiện thay đổi vé</h6>

                            <p>1. Giá vé Phổ thông siêu tiết kiệm:</p>
                            <ul>
                                <li>Hành trình nội địa Việt Nam: không được phép</li>
                                <li>Các hành trình khác: không được phép hoặc được phép mất phí/miễn phí tùy theo điều
                                    kiện của từng loại giá vé
                                </li>
                            </ul>
                            <p>2. Giá vé Phổ thông tiết kiệm:</p>
                            <ul>
                                <li>Hành trình nội địa Việt Nam:</li>
                                <ul>
                                    <li>Trước ngày khởi hành chặng bay ghi trên vé: được phép, mất phí</li>
                                    <li>Vào/Sau ngày khởi hành chặng bay ghi trên vé: không được phép</li>
                                </ul>
                                <li>Các hành trình khác: không được phép hoặc được phép mất phí/miễn phí tùy theo điều
                                    kiện của từng loại giá vé
                                </li>
                            </ul>
                            <p>3. Các loại giá vé khác: được phép, mất phí hoặc miễn phí tùy theo điều kiện của từng loại
                                giá vé
                            </p>

                            <h6>Điều kiện hoàn vé</h6>

                            <p> 1. Giá vé Phổ thông tiết kiệm/Phổ thông siêu tiết kiệm:</p>
                            <ul>
                                <li> Hành trình nội địa Việt Nam: không được phép</li>
                                <li> Các hành trình khác: không được phép hoặc được phép mất phí/miễn phí tùy theo điều
                                    kiện của từng loại giá vé
                                </li>
                            </ul>
                            <p> 2. Các loại giá vé khác: được phép, mất phí hoặc miễn phí tùy theo điều kiện của từng loại
                                giá
                                vé</p>
                            <b>3. Nếu Quý khách lựa chọn các loại giá vé khác nhau, điều kiện giá vé chặt nhất sẽ được áp
                                dụng
                                cho
                                toàn bộ hành
                                trình.</b>
                            <p>4. Phí hành lý trả trước và chọn chỗ ngồi ưa thích không được hoàn trả.</p>
                            <p>5. Phí giữ giá tốt không được hoàn trả</p>
                        </div>
                        <div class="box6">
                            <label>
                                <input type="checkbox" checked="checked" name="sameadr">Tôi đã đọc và đồng ý với điều kiện
                            </label>
                        </div>
                        <div class="box8">
                            <div class="boxx float-right">
                                <input type="submit" value="Chấp nhận và thanh toán ngay" class="box7">
                            </div>
                        </div>
            </div>
        </div>
</section>
    </form>
@endsection
