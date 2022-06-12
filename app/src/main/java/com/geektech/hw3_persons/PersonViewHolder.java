package com.geektech.hw3_persons;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPerson;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPerson = itemView.findViewById(R.id.person);
    }

    public void bind(String persons) {
        tvPerson.setText(persons);
    }
}
