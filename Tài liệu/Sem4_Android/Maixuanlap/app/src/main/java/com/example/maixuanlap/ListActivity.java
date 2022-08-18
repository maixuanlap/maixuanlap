package com.example.maixuanlap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.maixuanlap.adapter.ProductAdapter;
import com.example.maixuanlap.database.AppDatabase;
import com.example.maixuanlap.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    RecyclerView rvUser;
    List<Product> listProduct = new ArrayList<>();
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        db = AppDatabase.getAppDatabase(this);

        listProduct = db.userDao().getAll();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        ProductAdapter adapter = new ProductAdapter(this, listProduct);

        rvUser = findViewById(R.id.rvUser);
        rvUser.setLayoutManager(layoutManager);
        rvUser.setAdapter(adapter);

    }
}