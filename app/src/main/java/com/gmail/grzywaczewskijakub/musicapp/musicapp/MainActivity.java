package com.gmail.grzywaczewskijakub.musicapp.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artistDetails = (TextView) findViewById(R.id.button_artist_detail);
        TextView songDetails = (TextView) findViewById(R.id.button_song_detail);

        artistDetails.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ArtistDetail.class);
                startActivity(i);
            }
        });

        songDetails.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SongDetail.class);
                startActivity(i);
            }
        });

    }
}
