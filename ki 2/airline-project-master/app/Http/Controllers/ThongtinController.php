<?php

namespace App\Http\Controllers;
use App\Hanhkhach;
use App\News;
use App\the;
use App\Thongtinve;
use Illuminate\Http\Request;
use App\thongtin;

class ThongtinController extends Controller
{

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $this->validate($request,[
            'ho'=>'required',
            'ten'=>'required',
            'ngay_sinh'=>'required',
            'sdt'=>'required',
            'email'=>'required',
        ]);
        $the = new the();
        $hanhkhach = new Hanhkhach();
        $hanhkhach->cmnd= $request->get('cmnd');
        $hanhkhach->ho = $request->get('ho');
        $hanhkhach->ten = $request->get('ten');
        $hanhkhach->ngay_sinh= $request->get('ngay_sinh');
        $hanhkhach->gioi_tinh= $request->get('gioi_tinh');
        $hanhkhach->sdt= $request->get('sdt');
        $hanhkhach->email = $request->get('email');
        $hanhkhach->diachi = $request->get('diachi');
        return redirect('thanhtoan');
    }

    public function  storeprice(Request $request){
        $price = new Thongtinve();
        $price-> tongtien = $request->get('radio');
        $price->chuyenbay_id = $request->get('id');
        $price->save();
        return redirect('Hanhkhach');
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $post = Post::findOrFail($id);
        return view('huyve.post', compact('post'));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $post = Thongtinve::findOrFail($id);
        $post->delete();
        return view('huyve', compact('post'));
    }
}
