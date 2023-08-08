package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inventario(View view) {
        Intent inventario = new Intent(this, MainActivity2.class);
        startActivity(inventario);
    }

    public void venta(View view) {
        Intent venta = new Intent(this, MainActivity3.class);
        startActivity(venta);
    }


    public void regresar (View view) {
        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }
}