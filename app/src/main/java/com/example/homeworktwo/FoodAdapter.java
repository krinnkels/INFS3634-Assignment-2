package com.example.homeworktwo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class FoodAdapter extends RecyclerView.Adapter {


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item ,parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((FoodHolder) holder).bindView(position);

            }


    @Override
    public int getItemCount() {
        return ItemDetails.item_name.length;
    }

    private static class FoodHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mItemName;
        private TextView mItemPrice;
        private ImageView mItemImage;
        //ItemClickListener itemClickListener;


    public FoodHolder(View itemView){
            super(itemView);
            mItemName = (TextView) itemView.findViewById(R.id.item_name);
            mItemPrice = (TextView) itemView.findViewById(R.id.item_price);
            mItemImage = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);

                    }


     public void bindView (int position){
            mItemName.setText(ItemDetails.item_name[position]);
            mItemPrice.setText(ItemDetails.item_price[position]);
            mItemImage.setImageResource(ItemDetails.item_image[position]);

        }

        public void onClick(View view){


        }
    }

}
