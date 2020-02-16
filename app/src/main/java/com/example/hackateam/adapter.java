package com.example.hackateam;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.hackerViewHolder> {

    private String[] data;
    public adapter(String[] data){
        this.data = data;
    }

    @Override
    public hackerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.listitem, parent, false);
        return new hackerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(hackerViewHolder holder, int position){
        String title = data[position];
        holder.name.setText(title);
    }

    @Override
    public int getItemCount(){
        return data.length;
    }

    public class hackerViewHolder extends RecyclerView.ViewHolder{
        ImageView profilepic;
        TextView name;
        TextView skills;
        public hackerViewHolder (View itemView){
            super(itemView);
            profilepic = (ImageView) itemView.findViewById(R.id.profilepic);
            name = (TextView) itemView.findViewById(R.id.name);
            skills = (TextView) itemView.findViewById(R.id.skills);
        }
    }
}
