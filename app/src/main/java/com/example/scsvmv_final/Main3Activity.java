package com.example.scsvmv_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    TextView textview_1;
    RecyclerView recyclerView;
    String[] details;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textview_1=findViewById(R.id.textView_onclick_1);
        textview_1.setText(getIntent().getStringExtra("string_array"));
        recyclerView=findViewById(R.id.recycleview);
        details=getResources().getStringArray(R.array.depts_list);


    }
}
