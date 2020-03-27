package com.example.scsvmv_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Main2Activity extends AppCompatActivity
{

    RecyclerView recycler_view;
    RecyclerView.LayoutManager layoutManager;
    String[] deptscsvmv;
    int[] Image_array={R.drawable.cse, R.drawable.ece, R.drawable.eee, R.drawable.mech, R.drawable.civil, R.drawable.maths};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recycler_view=findViewById(R.id.recycleview);
        layoutManager=new GridLayoutManager(this,2);
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(layoutManager);
        deptscsvmv=getResources().getStringArray(R.array.depts);
        MyAdapter myAdapter=new MyAdapter(this,deptscsvmv,Image_array);
        recycler_view.setAdapter(myAdapter);
    }
}
