package com.demo.ss6.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.demo.ss6.R;
import com.demo.ss6.model.Item;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter {

    private Activity activity;
    private List<Item> listItem;

    public HomeAdapter(Activity activity, List<Item> listItem) {
        this.activity = activity;
        this.listItem = listItem;
    }

    public void reloadData(List<Item> list) {
        this.listItem = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item_home, parent, false);
        HomeHolder homeHolder = new HomeHolder(itemView);
        return homeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        HomeHolder homeHolder = (HomeHolder) holder;
        Item model = listItem.get(position);
        homeHolder.tvDate.setText(model.getDate());
        homeHolder.tvContent.setText(model.getContent().getDescription());
        homeHolder.tvTitle.setText(model.getTitle());
        Glide.with(activity).load(model.getImage()).into(homeHolder.ivCover);
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class HomeHolder extends RecyclerView.ViewHolder {
        TextView tvDate, tvTitle, tvContent;
        ImageView ivCover;

        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvContent = itemView.findViewById(R.id.tvContent);
            ivCover = itemView.findViewById(R.id.ivCover);
        }
    }
}
