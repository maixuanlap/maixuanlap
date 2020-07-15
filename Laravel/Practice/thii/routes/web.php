<?php
use Illuminate\Support\Facades\Route;
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
use \App\products;
use Illuminate\http\Request;

Route::get('/', function () {
    $products = products::orderBy('id','asc')->get();

    return view('home',compact('products'));
});

Route::post('/posts',function (Request $request){
    $validator = Validator::make($request->all(),[
        'name' =>'required|max:255',
    ]);

    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }
    $products = new products();
    $products->title = $request->title;
    $products->price = $request->price;
    $products->images = $request->images;
    $products->save();
    return redirect('/');
});
Route::post('/search',function (Request $request){
    $validator = Validator::make($request->all(),[
        'name' =>'required|max:255',
    ]);

    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }
    $products = products::where('title' , 'like', $request->name, 'or','id', $request->name)->get();
    return view('home', compact('products'));
});
Route::get('add',function (Request $request){
    $validator = Validator::make($request->all(),[
        'title' =>'required|max:255',
    ]);
    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }
    $products = new products();
    $products->title = $request->title;
    $products->price = $request->price;
    $products->images = $request->images;
    $products->save();
    return 'chuc mung ban da thanh cong';
});
Route::get('update',function (Request $request){
    $validator = Validator::make($request->all(),[
        'title' =>'required|max:255',
    ]);
    if ($validator->fails()){
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }
    $products = new products();
    $products->title = $request->title;
    $products->price = $request->price;
    $products->images = $request->images;
    $products->save();
    return 'chuc mung ban da thanh cong';
});
/**
 *
 */
Route::get('/delete/{delete}',function ($id){
    \App\products::findOrFail($id)->delete();
    return redirect('/');
});