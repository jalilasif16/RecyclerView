package com.jalilasif.recyclerview_jalilasif_192021.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jalilasif.recyclerview_jalilasif_192021.Adapter.ItemAdapter;
import com.jalilasif.recyclerview_jalilasif_192021.Model.ItemModel;
import com.jalilasif.recyclerview_jalilasif_192021.R;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ArrayList<ItemModel> itemModelArrayList = new ArrayList<>();
        itemModelArrayList.add(new ItemModel(R.mipmap.aps,"Army Public School","Rawalpindi"));
        itemModelArrayList.add(new ItemModel(R.mipmap.arid,"Agricultural University","Faisalabad"));
        itemModelArrayList.add(new ItemModel(R.mipmap.au,"Air University","Islamabad"));
        itemModelArrayList.add(new ItemModel(R.mipmap.comsats,"Comsats University","Wah Cantt"));
        itemModelArrayList.add(new ItemModel(R.mipmap.cust,"Cust University","Islamabad"));
        itemModelArrayList.add(new ItemModel(R.mipmap.fast,"Fast University","Peshawar"));
        itemModelArrayList.add(new ItemModel(R.mipmap.ff,"Fauji Foundation","Multan"));
        itemModelArrayList.add(new ItemModel(R.mipmap.giki,"Giki","Lahore"));
        itemModelArrayList.add(new ItemModel(R.mipmap.iiu,"Islamic University","Karachi"));
        itemModelArrayList.add(new ItemModel(R.mipmap.nust,"Nust University","Sahiwal"));
        itemModelArrayList.add(new ItemModel(R.mipmap.oxford,"Oxford University","London"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(itemModelArrayList));

    }
}