<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('home');});
Route::get('home','HomeController@home');
Route::get('trangthai','HomeController@trangthai');
Route::get('Uudai2','HomeController@uudai2');
Route::get('Gioithieu','HomeController@gioithieu');
Route::get('Uudai','HomeController@uudai');
Route::post('/storeprice','ThongtinController@storeprice');
Route::get('ve','HomeController@ve');
Route::get('Muave','ProjectController@search');
Route::get('chuyenbay','HomeController@chuyenbay');
Route::get('thanhtoan','HomeController@thanhtoan');
Route::post('/hanhkhachstore','ThongtinController@store');
Route::get('Hanhkhach','HomeController@Hanhkhach');
Route::get('huyve','HomeController@huyve');
Route::get('thanhtoanhoantat','HomeController@thanhtoanhoantat');
Route::post('/huyveshow','HomeController@huyve');
Route::post('/storecard','ProjectController@store');
Route::get('hoanthanh','HomeController@hoanthanh');
Route::post('/huyveshow','HomeController@huyve');
Route::get('tintuc','HomeController@tintuc');
Route::get('tintuc2','HomeController@tintuc2');








