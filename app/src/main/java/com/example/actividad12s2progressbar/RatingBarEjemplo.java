package com.example.actividad12s2progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarEjemplo extends AppCompatActivity {

    //Declaración de variables
    TextView txt;
    RatingBar rtb;
    Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        //Se asocia cada variable con las del XML
        txt = (TextView) findViewById(R.id.txt1);
        rtb = (RatingBar) findViewById(R.id.rtBar1);
        volver = findViewById(R.id.volverMain);

        //Listener para el botón de volver
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(RatingBarEjemplo.this,MainActivity.class);
                startActivity(intentMain);
            }
        });

        //Se crea el Listener para la rating bar, cuando esta cambie se activa
        //En este caso cambia el texto para indicar cuantas estrellas están seleccionadas
        rtb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txt.setText(v + "Estrellas");

            }
        });
    }
}