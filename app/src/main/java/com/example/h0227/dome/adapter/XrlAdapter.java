package com.example.h0227.dome.adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.h0227.dome.R;
import com.example.h0227.dome.bean.Bean;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class XrlAdapter extends RecyclerView.Adapter<XrlAdapter.ViewHolder> {
    private ArrayList<Bean.ResultsBean> list;
    Context context;

    public XrlAdapter(ArrayList<Bean.ResultsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public XrlAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull XrlAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv1.setText(list.get(i).get_id());
        viewHolder.tv2.setText(list.get(i).getCreatedAt());
        Glide.with(context).load(list.get(i).getUrl()).into(viewHolder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView iv;
        private final TextView tv2;
        private final TextView tv1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            iv = itemView.findViewById(R.id.iv);
        }
    }
}
