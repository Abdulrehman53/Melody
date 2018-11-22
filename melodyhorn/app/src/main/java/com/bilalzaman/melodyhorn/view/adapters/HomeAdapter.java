package com.bilalzaman.melodyhorn.view.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bilalzaman.melodyhorn.models.HomeModel;
import com.bilalzaman.melodyhorn.R;

import java.util.ArrayList;

import static com.bilalzaman.melodyhorn.R.color.clickColor;

/**
 * Created by BilalZaman on 19/11/2018.
 */
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private Context context;
    private ArrayList<HomeModel> data = new ArrayList<>();

    public HomeAdapter(Context context, ArrayList<HomeModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_melody,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        HomeModel model = data.get(position);
        holder.txtItem.setText(model.getMelodyName());

        holder.imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.imgPlay.setVisibility(View.GONE);
                holder.imgPause.setVisibility(View.VISIBLE);
                holder.constraintLayout.setBackgroundColor(Color.DKGRAY);
            }
        });

        holder.imgPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.constraintLayout.setBackgroundColor(Color.TRANSPARENT);
                holder.imgPause.setVisibility(View.GONE);
                holder.imgPlay.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtItem;
        private ImageView imgPlay, imgPause;
        private ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtItem = itemView.findViewById(R.id.txtName);
            imgPlay = itemView.findViewById(R.id.imgPlay);
            imgPause = itemView.findViewById(R.id.imgPause);
            constraintLayout = itemView.findViewById(R.id.main_layout);
        }
    }
}
