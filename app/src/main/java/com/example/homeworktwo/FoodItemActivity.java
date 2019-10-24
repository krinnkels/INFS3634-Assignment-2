package com.example.homeworktwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class FoodItemActivity extends AppCompatActivity {
    private TextView food_name;
    private TextView food_description;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_item_detail);

        ActionBar actionBar = getSupportActionBar();


        food_name = findViewById(R.id.food_name);
        food_description = findViewById(R.id.food_description);
        imageView = findViewById(R.id.imageView2);

        Intent intent = getIntent();


    }

}

