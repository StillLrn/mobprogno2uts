package com.example.uts_mobprog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RC_ViewAdapter extends RecyclerView.Adapter<displayHolder> {

    Context context;
    List<Contact> items;

    public RC_ViewAdapter(Context context, List<Contact> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public displayHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new displayHolder(LayoutInflater.from(context).inflate(R.layout.contact_template, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull displayHolder holder, int position)
    {
        holder.nameView.setText(items.get(position).getName());
        holder.nationView.setText(items.get(position).getNation());
        holder.elementView.setText(items.get(position).getElement());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }
}
