package com.gmail.grzywaczewskijakub.musicapp.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ArtistDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_detail);

        TextView payment = (TextView) findViewById(R.id.button_payment);
        TextView artistList = (TextView) findViewById(R.id.button_artists_list);

        payment.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistDetail.this, PaymentActivity.class);
                startActivity(i);
            }
        });

        artistList.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ArtistDetail.this, ArtistList.class);
                startActivity(i);
            }
        });
    }
}
