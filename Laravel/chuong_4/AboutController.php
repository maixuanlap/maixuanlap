<?php


namespace App\Http\Controllers;


use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Routing\Controller as BaseController;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Foundation\Auth\Access\AuthorizesRequests;

class AboutController extends BaseController
{
       public function showDetails(){
           return'About Details Information';
       }
       public function showSubject($Subject){
           return" Details Information about $Subject";
       }
}