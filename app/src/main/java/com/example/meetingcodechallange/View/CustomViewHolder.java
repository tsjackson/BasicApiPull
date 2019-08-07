package com.example.meetingcodechallange.View;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meetingcodechallange.R;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView tv_firstName, tv_lastName, tv_address, tv_phoneNumber, tv_type;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_firstName = itemView.findViewById(R.id.tv_name);
        tv_lastName = itemView.findViewById(R.id.tv_lastName);
        tv_address = itemView.findViewById(R.id.tv_address);
        tv_phoneNumber = itemView.findViewById(R.id.tv_phoneNumber);
        tv_type = itemView.findViewById(R.id.tv_type);
    }
}
