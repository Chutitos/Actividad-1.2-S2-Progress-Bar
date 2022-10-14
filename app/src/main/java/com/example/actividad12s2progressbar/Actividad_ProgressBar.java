package com.example.actividad12s2progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Actividad_ProgressBar extends AppCompatActivity {
    //DECLARACION DE VARIABLES
    private int progresoActual=0; //contador que lleva el progreso de la barra
    private ProgressBar barra; //barra de progreso
    private Button btnEmpezar; //boton para comenzar el llenado de la barra
    private Button btnReiniciar; //boton para reiniciar la barra
    private Button btnVolver;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        barra=findViewById(R.id.barraProgreso);
        btnEmpezar=findViewById(R.id.comenzarProgreso);
        btnReiniciar=findViewById(R.id.reiniciarProgreso);
        btnVolver=findViewById(R.id.volverMain);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(Actividad_ProgressBar.this,MainActivity.class);
                startActivity(intentMain);
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progresoActual = 0;
                barra.setProgress(progresoActual);
                barra.setMax(100);
            }
        });

        btnEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progresoActual = progresoActual + 10; //SE INCREMENTA EL CONTADOR
                barra.setProgress(progresoActual); // ACTUALIZA EL PROGRESO DE LA BARRA
                barra.setMax(100);//VALOR MAXIMO DE LA BARRA
            }
        });
    }
}