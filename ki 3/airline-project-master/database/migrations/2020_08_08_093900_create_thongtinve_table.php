<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateThongtinveTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('thongtinve', function (Blueprint $table) {
            $table->id();
            $table->integer('tongtien');
            $table->unsignedBigInteger('chuyenbay_id');
            $table->foreign('chuyenbay_id')->references('id')->on('chuyenbay');
            $table->unsignedBigInteger('hk_id')->nullable();
            $table->foreign('hk_id')->references('id')->on('hanhkhach');
            $table->unsignedBigInteger('the_id')->nullable();
            $table->foreign('the_id')->references('id')->on('the');
            $table->timestamps();

        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('thongtinve');
    }
}
