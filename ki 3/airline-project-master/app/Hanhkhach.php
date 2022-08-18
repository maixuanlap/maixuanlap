<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Hanhkhach extends Model
{
    protected $table='hanhkhach';

    public function thongtinve(){
        return $this->belongsTo('app\Thongtinve','hk_id','id');
    }

}
