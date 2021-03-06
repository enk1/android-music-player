package com.gmail.grzywaczewskijakub.musicapp.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ArtistList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);

        TextView playNow = (TextView) findViewById(R.id.button_play_now);
        TextView songDetail = (TextView) findViewById(R.id.button_song_detail);

        playNow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistList.this, MainActivity.class);
                startActivity(i);
            }
        });

        songDetail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistList.this, SongDetail.class);
                startActivity(i);
            }
        });
    }
}
