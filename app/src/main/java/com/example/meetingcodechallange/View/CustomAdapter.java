package com.example.meetingcodechallange.View;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingcodechallange.Model.InformationPojo;
import com.example.meetingcodechallange.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private InformationPojo dataset;

    public void setDataset(InformationPojo dataset){
        this.dataset = dataset;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_firstName.setText(dataset.firstName);
        holder.tv_lastName.setText(dataset.lastName);
        holder.tv_phoneNumber.setText(dataset.getFullNumber());
        holder.tv_address.setText(dataset.address.toString());
    }

    @Override
    public int getItemCount() {
        return dataset != null ? 1 : 0;
    }
}
