package com.example.actividad12s2progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button progress;
    Button seek;
    Button rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress=findViewById(R.id.btnProgress);
        seek=findViewById(R.id.btnSeek);
        rating=findViewById(R.id.btnRating);

        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentProgreso = new Intent(MainActivity.this,Actividad_ProgressBar.class);
                startActivity(intentProgreso);
            }
        });

        seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSeek = new Intent(MainActivity.this,Seekbar.class);
                startActivity(intentSeek);
            }
        });

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRating = new Intent(MainActivity.this,RatingBarEjemplo.class);
                startActivity(intentRating);
            }
        });
    }
}