package com.gmail.grzywaczewskijakub.musicapp.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SongDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);

        TextView payment = (TextView) findViewById(R.id.button_payment);
        TextView artistDetail = (TextView) findViewById(R.id.button_artist_detail);

        payment.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongDetail.this, PaymentActivity.class);
                startActivity(i);
            }
        });

        artistDetail.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongDetail.this, ArtistDetail.class);
                startActivity(i);
            }
        });
    }
}
