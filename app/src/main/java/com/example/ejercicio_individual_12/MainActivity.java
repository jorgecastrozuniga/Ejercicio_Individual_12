package com.example.ejercicio_individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ejercicio_individual_12.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding abinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        abinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(abinding.getRoot());


        abinding.ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intento);
            }
        });

        Log.d("prueba", "funciona el intento");
    }
}