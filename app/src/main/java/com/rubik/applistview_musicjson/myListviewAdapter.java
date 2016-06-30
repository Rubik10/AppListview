package com.rubik.applistview_musicjson;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

    /**
         * Created by Rubik on 29/6/16.
     */
    public class myListviewAdapter extends BaseAdapter {
        Activity activity;
        private LayoutInflater inflater;
        private List<Album> listAlbums;

        public myListviewAdapter(MainActivity mainActivity, List<Album> listAlbums) {
            this.activity = mainActivity;
            inflater = LayoutInflater.from(mainActivity);
            this.listAlbums = listAlbums;
        }

            @Override
        public int getCount() {return listAlbums.size();}

            @Override
        public Album getItem(int position) {return listAlbums.get(position);}

            @Override
        public long getItemId(int position) {return position;}


            @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            MyViewHolder holder;

            if (row == null) {
                row = inflater.inflate(R.layout.listview_row, parent, false);
                holder = new MyViewHolder();

                holder.image = (ImageView) row.findViewById(R.id.thumbnail);
                holder.txtArtist = (TextView) row.findViewById(R.id.artist);
                holder.txtTittle = (TextView) row.findViewById(R.id.titulo);
                holder.txtGenre = (TextView) row.findViewById(R.id.genre);
                holder.txtYear = (TextView) row.findViewById(R.id.releaseYear);

                row.setTag(holder);
            } else {holder = (MyViewHolder) row.getTag();}

            if(position == MainActivity.SELECTED_POS) { // selected Item Color
                row.setBackgroundColor(Color.parseColor("#C66297C6")); //Color.parseColor("#2C87D5")
            } else {   // unselected Item Color
                row.setBackgroundColor(Color.TRANSPARENT);
            }

            Album album = getItem(position);

            Picasso.with(activity).load(album.getCoverURL()).resize(80,80).into( holder.image);
            holder.txtTittle.setText(album.getTittle());
            holder.txtArtist.setText(album.getArtist());
            holder.txtGenre.setText(album.getGenre());
            holder.txtYear.setText(album.getYear());

            return row;
        }


    public static class  MyViewHolder {
        ImageView image;
        TextView txtArtist, txtTittle, txtGenre, txtYear;
    }


}
