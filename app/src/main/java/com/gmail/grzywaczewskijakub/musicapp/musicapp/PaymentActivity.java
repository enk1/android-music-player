package com.gmail.grzywaczewskijakub.musicapp.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView songDetail = (TextView) findViewById(R.id.button_song_detail);
        TextView artistDetail = (TextView) findViewById(R.id.button_artist_detail);

        songDetail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaymentActivity.this, SongDetail.class);
                startActivity(i);
            }
        });

        artistDetail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PaymentActivity.this, ArtistDetail.class);
                startActivity(i);
            }
        });

    }
}
