<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateHanhkhachTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('hanhkhach', function (Blueprint $table) {
            $table->id();
            $table->text('cmnd');
            $table->text('ten');
            $table->text('ho');
            $table->text('sdt');
            $table->text('email');
            $table->text('gioi_tinh');
            $table->date('ngay_sinh');
            $table->text('diachi');
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
        Schema::dropIfExists('hanhkhach');
    }
}
