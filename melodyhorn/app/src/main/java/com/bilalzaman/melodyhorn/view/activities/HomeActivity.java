package com.bilalzaman.melodyhorn.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bilalzaman.melodyhorn.view.adapters.HomeAdapter;
import com.bilalzaman.melodyhorn.models.HomeModel;
import com.bilalzaman.melodyhorn.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<HomeModel> data = new ArrayList<>();
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);
        homeAdapter = new HomeAdapter(this,data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(homeAdapter);
    }
}
