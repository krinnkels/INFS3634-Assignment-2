package com.example.homeworktwo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class FoodFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){

            View view = inflater.inflate(R.layout.food_fragment, container, false);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

            FoodAdapter foodAdapter = new FoodAdapter();
            recyclerView.setAdapter(foodAdapter);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager((getActivity()));
            recyclerView.setLayoutManager((layoutManager));

            return view;


    }

}
