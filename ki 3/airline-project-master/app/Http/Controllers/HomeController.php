<?php

namespace App\Http\Controllers;
use DB;
use Illuminate\Http\Request;

class HomeController extends Controller
{
  public function uudai()
  {
      return view('Uudai');
  }
    public function uudai2()
    {
        return view('Uudai2');
    }

    public function trangthai(Request $request)
    {
        $chuyenbay = DB::table('chuyenbay')
            ->join('maybay','chuyenbay.maybay_id','=','maybay.id')
            ->orderby('ngaykhoihanh','DESC')
            ->paginate(10);
        return view('trangthai',compact('chuyenbay'));
    }
    public function gioithieu()
    {
        return view('Gioithieu');
    }
      public function ve()
    {
        return view('ve');
    }
    public function Hanhkhach()
    {
        return view('Hanhkhach');
    }
    public function muave()
    {
        return view('Muave');
    }
    public function chuyenbay()
    {
        return view('chuyenbay');
    }
    public function thanhtoan()
    {
        return view('thanhtoan');
    }
    public function huyve(){
      return view('huyve');
    }
    public function thanhtoanhoantat(){
        return view('thanhtoanhoantat');
    }
    public function hoanthanh(){
      return view('hoanthanh');
    }
    public function home(){
      return view('home');
    }
    public function tintuc(){
      return view('tintuc');
    }
    public function tintuc2(){
      return view('tintuc2');
    }
}
