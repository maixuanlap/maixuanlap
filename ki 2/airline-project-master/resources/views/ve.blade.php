@extends('layouts.default')
@section('title','Vé')
@section('css','css/ve.css')
@section('content')
    <section class="parallax">
        <div class="container">
            <div class="box1">
                <div class="box2">
                    <div class="boxx1 text-center">
                        <h5>VÉ ĐIỆN TỬ VÀ XÁC NHẬN HÀNH TRÌNH</h5>
                        <h6>E-TICKET RECEIPT</h6>
                    </div>
                    <hr class="my-3">
                </div>
                <div class="box3">
                    <div class="boxx2">
                        <p>MÃ ĐẶT CHỖ/RESERVATION CODE:</p>
                        <p>NGÀY ĐẶT CHỖ/ISSUE DATE:</p>
                        <p>HÃNG/AIRLINES: VietName Airlines</p>
                        <p>ĐIỆN THOẠI/PHONE:</p>
                    </div>
                    <div class="boxx3">
                        <p>HÀNH KHÁCH/PASSENGER</p>
                    </div>
                    <div class="boxx4">
                        <p>TRANG THÁI/STATUS: ĐÃ THANH TOÁN/PAID</p>
                    </div>
                    <div class="boxx4">
                        <p>GIÁ VÉ/PRICE: </p>
                    </div>
                    <div class="boxx5">
                        <table class="text-center" border="1" >
                            <tr>
                                <td>Ngày/<br/>Date</td>
                                <td>Chuyến bay/<br/>Fliglt</td>
                                <td>Khởi hành/<br/>Departure</td>
                                <td>Thời gian<br/>Time</td>
                                <td>Đến/<br/>Arrival</td>
                                <td>Thời gian<br/>Time</td>
                            </tr>
                            <tr>
                                <td>8/10/2020</td>
                                <td>VN321</td>
                                <td>Ho Chi Minh(SGN)</td>
                                <td>20:20</td>
                                <td>Hue(HUI)</td>
                                <td>21:40</td>
                            </tr>
                        </table>
                        <p>*Mỗi hành khách được phép mang tối đa 07kg hành lý sách tay. 20kg hành lý gửi</p>
                    </div>
                    <div class="boxx6">
                        <h6>THÔNG TIN QUAN TRỌNG</h6>
                        <b>Giấy tờ tuỳ thân:</b><p>Quý khách vui lòng mang theo giấy tờ tuỳ thân(CMND,Passport,Giấy phép lái xe,Giấy khai sinh(cho em bé, trẻ em) khi làm thủa tục.</p>
                        <b>Thời gian:</b><p>Đến sân bay ít nhất 1h30 trước giờ bay để làm thủ tục.<br/></p>
                    </div>
                </div>
            </div>
        </div>
    </section>
@endsection
