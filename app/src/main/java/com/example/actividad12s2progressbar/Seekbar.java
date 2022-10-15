package com.example.actividad12s2progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Seekbar extends AppCompatActivity {

    //Declaración de variables
    SeekBar seekbar;
    TextView txt;
    Button volver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        //Asocial las variables con las de XML
        seekbar = (SeekBar) findViewById(R.id.skBar1);
        txt = (TextView) findViewById(R.id.txt1);
        volver=findViewById(R.id.volverMain);

        //Botón de volver
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(Seekbar.this, MainActivity.class);
                startActivity(intentMain);
            }
        });

        //Declaración del listener para la seekbar, este se activa cada vez que la selección cambia
        //En este caso entra a un switch con el int i (Número seleccionado) y dependiendo del
        //número cambia el texto y el color
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                switch (i) {
                    case 0:
                        txt.setText("Negro");
                        txt.setTextColor(Color.BLACK);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 1:
                        txt.setText("Rojo");
                        txt.setTextColor(Color.RED);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 2:
                        txt.setText("Azul");
                        txt.setTextColor(Color.BLUE);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 3:
                        txt.setText("Verde");
                        txt.setTextColor(Color.GREEN);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 4:
                        txt.setText("Magenta");
                        txt.setTextColor(Color.MAGENTA);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 5:
                        txt.setText("Amarillo");
                        txt.setTextColor(Color.YELLOW);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 6:
                        txt.setText("Cyan");
                        txt.setTextColor(Color.CYAN);
                        txt.setBackgroundColor(Color.TRANSPARENT);
                        break;
                    case 7:
                        txt.setText("Blanco");
                        txt.setTextColor(Color.WHITE);
                        txt.setBackgroundColor(Color.BLACK);
                        break;

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


}