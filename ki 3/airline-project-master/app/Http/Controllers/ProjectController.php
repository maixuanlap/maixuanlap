<?php

namespace App\Http\Controllers;

use App\Chuyenbay;
use App\the;

use Illuminate\Http\Request;
use DB;
class ProjectController extends Controller
{

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $the = new the();
        $the -> loai_the = $request->get('radio');
        $the ->ma_the = $request->get('sothe');
        $the -> ten = $request->get('ten');
        $the->hsd = $request->get('hsd');
        $the->save();
        return redirect('hoanthanh');
    }

    public function search(Request $request){
        $flights = DB::table('chuyenbay')
            ->join('giave','chuyenbay.giave_id','=','giave.id')
            ->join('maybay','chuyenbay.maybay_id','=','maybay.id')
            ->where('noidi','LIKE',$request->diemdi)
            ->where('noiden','LIKE',$request->diemden)
            ->whereDate('ngaykhoihanh',$request->ngaydi)
            ->get();
        return view('Muave',compact('flights'));
    }
    public function searchinfo(Request $request){
        $info = DB::table('thongtinve')
            ->join('chuyenbay','thongtinve.chuyenbay_id','=','chuyenbay.id')
            ->join('hanhkhach','thongtinve.hk_id','=','hanhkhach.id')
            ->join('the','thongtinve.the_id','=','the.id')
            ->where('id','LIKE',$request->search)
            ->get();
    }

}
