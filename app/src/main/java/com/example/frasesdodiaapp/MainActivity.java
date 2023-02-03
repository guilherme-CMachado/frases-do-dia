package com.example.frasesdodiaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        String[] frases= {
                "Frase 1",
        "Frase 2",
        "Frase 3",
        "Frase 4",
        };
        int numero = new Random().nextInt(4);
    TextView textView = findViewById(R.id.textoResultado);
        textView.setText(frases[numero]);
    }
}