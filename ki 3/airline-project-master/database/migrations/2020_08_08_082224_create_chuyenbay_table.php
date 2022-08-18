<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateChuyenbayTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('chuyenbay', function (Blueprint $table) {
            $table->id();
            $table->date('ngaykhoihanh');
            $table->text('noidi');
            $table->text('noiden');
            $table->time('giodi');
            $table->time('gioden');
            $table->text('thoigian');
            $table->unsignedBigInteger('maybay_id');
            $table->foreign('maybay_id')->references('id')->on('maybay');
            $table->unsignedBigInteger('giave_id');
            $table->foreign('giave_id')->references('id')->on('giave');
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
        Schema::dropIfExists('chuyenbay');
    }
}
