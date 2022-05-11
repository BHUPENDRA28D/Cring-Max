package com.example.cringmax;


import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VedioAdaptor extends RecyclerView.Adapter<VedioAdaptor.myviewHolder>
{
    //making vedio modle type ArrayList
    ArrayList<VedioModle> videos;

    public VedioAdaptor(ArrayList<VedioModle> videos){
        this.videos = videos;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_vedio_row,parent,false);
       return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
            holder.setData(videos.get(position));
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }
    //________________________________________________







    //----------------------------
    class myviewHolder extends RecyclerView.ViewHolder{

        VideoView videoView;
        TextView  title,desc;

        public myviewHolder(View itemView){
            super(itemView);
            videoView = itemView.findViewById(R.id.id_vedioView);
            title = itemView.findViewById(R.id.id_txtVedioTitle);
            desc = itemView.findViewById(R.id.id_txtDiscripton);
        }
        void setData(VedioModle obj){
            videoView.setVideoPath(obj.getUrl());
            title.setText(obj.getTitle());
            desc.setText(obj.getDesc());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });

        }
    }
}
