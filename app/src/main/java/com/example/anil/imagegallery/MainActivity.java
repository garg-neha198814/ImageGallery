package com.example.anil.imagegallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {


    RecyclerView mRecycleview;
    RecyclerView.LayoutManager mLayout;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleview = (RecyclerView) findViewById(R.id.recycler_view);
        mLayout = new LinearLayoutManager(this);
        mRecycleview.setLayoutManager(mLayout);
        mAdapter = new GridAdapter(this);
        mRecycleview.setAdapter(mAdapter);


    }





    }

