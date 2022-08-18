<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class the extends Model
{
    protected $table='the';

    public function the(){
        return $this->belongsTo('app\Thongtinve','the_id','id');
    }
}
