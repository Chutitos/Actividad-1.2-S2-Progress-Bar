package com.example.actividad12s2progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Seekbar extends AppCompatActivity {

    SeekBar seekbar;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        seekbar = (SeekBar) findViewById(R.id.skBar1);
        txt = (TextView) findViewById(R.id.txt1);

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