package com.example.ejercicio_individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ejercicio_individual_12.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding bbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bbinding= ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(bbinding.getRoot());


        bbinding.botonmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });


        bbinding.botonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentito= new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intentito);
            }
        });

        Log.d("prueba2", "el IDE en esta clase funciona");
    }
}