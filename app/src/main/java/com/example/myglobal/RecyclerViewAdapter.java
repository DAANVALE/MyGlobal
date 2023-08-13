package com.example.myglobal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyviewHolder>{

    private Context mContext;
    private List<Video> mData;

    public RecyclerViewAdapter(Context mContext, List<Video> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //7
        View view;

        LayoutInflater mInflate = LayoutInflater.from(mContext);
        view = mInflate.inflate(R.layout.cardview_item_netflix, parent, false);
            return new MyviewHolder(view);
    }

    /*
    * @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, final int position) {
        //---10
        holder.tv_video_title.setText(mData.get(position).getTitle());
        holder.img_view_thumbnail.setImageResource(mData.get(position).getThumbnail());

        //---11
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Video_Activity.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Category", mData.get(position).getCategory());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                mContext.startActivity(intent);
            }
        });
    }
     */

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {

        final int clickedPosition = position;
        //---10
        holder.tv_video_title.setText(mData.get(position).getTitle());
        holder.img_view_thumbnail.setImageResource(mData.get(position).getThumbnail());

        //---11
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickedPosition != RecyclerView.NO_POSITION) {
                    Intent intent = new Intent(mContext, Video_Activity.class);
                    intent.putExtra("Title", mData.get(clickedPosition).getTitle());
                    intent.putExtra("Description", mData.get(clickedPosition).getDescription());
                    intent.putExtra("Category", mData.get(clickedPosition).getCategory());
                    intent.putExtra("Thumbnail", mData.get(clickedPosition).getThumbnail());
                    mContext.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder{

        TextView tv_video_title;
        ImageView img_view_thumbnail;
        CardView cardView;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            tv_video_title = (TextView) itemView.findViewById(R.id.video_title_id);
            img_view_thumbnail = (ImageView) itemView.findViewById(R.id.video_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}