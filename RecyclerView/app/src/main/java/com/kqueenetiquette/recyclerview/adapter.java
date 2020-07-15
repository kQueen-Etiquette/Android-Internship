package com.kqueenetiquette.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    int myImages[];
    String myCodeName[];
    String myVersion[];
    String myAPI[];
    String myRelease[];
    Context text;


    public adapter(MainActivity mainActivity, int[] images, String[] versions, String[] name, String[] api, String[] release) {
        myImages = images;
        myCodeName = name;
        myVersion = versions;
        myAPI = api;
        myRelease = release;
        text = mainActivity;
    }

    @NonNull
    @Override
    public adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(text).inflate(R.layout.mydata, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(myImages[position]);
        holder.code_name.setText(myCodeName[position]);
        holder.android_version.setText("Version: " + myVersion[position]);
        holder.api_level.setText("API: " + myAPI[position]);
        holder.release_date.setText("Release date: " + myRelease[position]);

    }


    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView code_name, android_version, api_level, release_date;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            code_name = itemView.findViewById(R.id.code_name);
            android_version = itemView.findViewById(R.id.android_version);
            api_level = itemView.findViewById(R.id.api_level);
            release_date = itemView.findViewById(R.id.release_date);

        }
    }
}
