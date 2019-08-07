package com.example.meetingcodechallange.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.meetingcodechallange.Model.InformationPojo;
import com.example.meetingcodechallange.R;
import com.example.meetingcodechallange.ViewModel.CustomViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final CustomAdapter customAdapter = new CustomAdapter();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter);

        CustomViewModel customViewModel = ViewModelProviders.of(this).get(CustomViewModel.class);

        customViewModel.getData().observe(this, new Observer<InformationPojo>() {
            @Override
            public void onChanged(InformationPojo informationPojo) {
                customAdapter.setDataset(informationPojo);
            }
        });
    }
}
