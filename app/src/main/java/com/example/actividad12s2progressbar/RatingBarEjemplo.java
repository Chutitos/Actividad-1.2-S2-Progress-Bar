package com.example.actividad12s2progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarEjemplo extends AppCompatActivity {

    TextView txt;
    RatingBar rtb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        txt = (TextView) findViewById(R.id.txt1);
        rtb = (RatingBar) findViewById(R.id.rtBar1);

        rtb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txt.setText(v + "Estrellas");
                Toast.makeText(MainActivity.this, "El rating ha cambiado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}