package com.example.admin.movieforyou;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 12/24/2016.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    ArrayList<Movies> movies = new ArrayList<Movies>();

    public MoviesAdapter(ArrayList<Movies> movies){
        this.movies = movies;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView title;
        public TextView version;
        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            title = (TextView) itemView.findViewById(R.id.title);
            version = (TextView) itemView.findViewById(R.id.version);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movies movie = movies.get(position);
//        holder.img.setBackgroundResource(movie.getBackground_image().hashCode());
        holder.title.setText(movie.getTitle());
        holder.version.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
