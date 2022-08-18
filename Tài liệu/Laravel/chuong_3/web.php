<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| This file is where you may define all of the routes that are handled
| by your application. Just tell Laravel the URIs it should respond
| to using a Closure or controller method. Build something great!
|
*/
use App\Post;

Route::get('/', function () {
    return view('welcome ');
});
Route::get('profile/{name}','ProfileController@showProfile');

Route::get('home','HomeController@showWelcome');

Route::get('abouts','AboutController@showDetails');

Route::get('abouts/{Subject}','AboutController@showSubject');

Route::get('about',function (){
    return 'About Content';
});
Route::get('about/directions',array('as'=>'directions',function (){
    $theURL=URL::route('directions');
    return "Directions go to this URL:$theURL";
}));
Route::any('submit-from',function(){
    return 'Process porn';
});
//đuôi tự viết trả về kết quả
Route::get('about/{theSubject}',function($theSubject){
  return $theSubject. 'content goes here';
});
//trả về kết quả là chuỗi gồm 2 giá trị
Route::get('about/classes/{theArt}/{thePrice}',function ($theArt,$thePrice){
    return "The product: $theArt and $thePrice";
});
//chuyển quyền sang trang khác
Route::get('where',function(){
    return Redirect::route('directions');
});
Route::get('insert',function (){
    DB::insert('insert into posts(title,body,is_admin)values (?,?,?)',['PHP with Laravel','Laravel is the best framework!',0]);
    return'DONE';
});
//truy vấn dữ liệu
Route::get('read',function (){
    $result=DB::select('select*from posts where id=?',[1]);
 //   return $result;
    foreach ($result as $posts){
        return $posts->body;
    }
});
//cập nhật dữ liệu
Route::get('update',function (){
    $updated=DB::update('update posts set title="New title hihi"where id=1',[1]);
    return $updated;
});
//xóa dữ liệu
Route::get('delete',function (){
    $deleted=DB::delete('delete from posts where id=2',[2]);
    return $deleted;
});
Route::get('readAll',function (){
    $posts=Post::all();
    foreach ($posts as $p){
        echo $p->title."".$p->body;
        echo "<br>";
    }
});
//tim kiem ban ghi
Route::get('findId',function (){
    $posts=Post::where('id','>=','2')
        ->where('title','PHP with Laravel')
        ->where('body','like','PHP with Laravel')
        ->orderBy('id','desc')
        ->take(1)
        ->get();
    foreach ($posts as $p){
        echo $p->title."".$p->body;
        echo "<br>";
    }
});
//them ban ghi
Route::get('insertORM',function (){
    $p=new Post;
    $p->title='insert ORM';
    $p->body='insert ORM ha';
    $p->is_admin=1;
    $p->save();

});
//update ban ghi
Route::get('updateORM',function (){
    $p= Post::where('id',4)->first();
    $p->title='insert ORM';
    $p->body='insert ORM mxl';
    $p->is_admin=1;
    $p->save();

});
Route::get('deleteORM',function (){
    Post::where('id','>=',5)
        ->delete();
});
Route::get('destroyORM',function (){
    Post::destroy([4]);
});