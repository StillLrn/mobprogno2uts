package com.example.uts_mobprog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class displayHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, nationView, elementView;

    public displayHolder(@NonNull View itemView) {
        super(itemView);
        imageView =itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        nationView =  itemView.findViewById(R.id.nation);
        elementView = itemView.findViewById(R.id.element);
    }
}
