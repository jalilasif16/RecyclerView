package com.jalilasif.recyclerview_jalilasif_192021.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.jalilasif.recyclerview_jalilasif_192021.Model.ItemModel;
import com.jalilasif.recyclerview_jalilasif_192021.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{

    private final ArrayList<ItemModel> itemModelArrayList;


    public ItemAdapter(ArrayList<ItemModel>itemModelArrayList){
        this.itemModelArrayList = itemModelArrayList;
    }

    @NonNull
    @NotNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ItemViewHolder holder, int position) {
        ItemModel itemModel = itemModelArrayList.get(position);
        holder.title.setText(itemModel.getTitle());
        holder.description.setText(itemModel.getDescription());
        holder.image.setImageResource(itemModel.getImage());
        holder.deleteButton.setOnClickListener(v -> {

            itemModelArrayList.remove(position);

            notifyDataSetChanged();
        });
    }

    @Override
    public int getItemCount() {
        return itemModelArrayList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final ImageButton deleteButton;
        private final TextView title;
        private final TextView description;
        private final CircleImageView  image;

        public ItemViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            image = itemView.findViewById(R.id.symbol);
            deleteButton = itemView.findViewById(R.id.list_item_delete_button);
        }
    }
}
