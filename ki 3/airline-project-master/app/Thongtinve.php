<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Thongtinve extends Model
{
    protected $table = "thongtinve";
    protected $fillable = ['giave','chuyenbay_id','the_id','hk_id'];
    public function hanhkhach(){
        return $this->hasMany('app\Hanhkhach','hk_id','id');
    }
    public  function chuyenbay(){
        return $this->belongsTo('app\Chuyenbay','chyenbay_id','id');
    }



}
