package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText producto, nombre, preci;
    Button guardar,eliminar,actu, leer;
    TextView contenido;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    
        setContentView(R.layout.activity_main3);
        producto=(EditText)findViewById(R.id.producto);
        nombre=(EditText)findViewById(R.id.nombre);
        preci=(EditText)findViewById(R.id.preci);
        guardar=(Button)findViewById(R.id.guardar);
        eliminar=(Button)findViewById(R.id.eliminar);
        actu=(Button)findViewById(R.id.actu);
        leer=(Button)findViewById(R.id.leer);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!producto.getText().toString().equals("")&&!nombre.getText().toString().equals(""))

            nombre.getText().toString();
                else
                    Toast.makeText(getApplicationContext(),"Capturar",Toast.LENGTH_SHORT).show();
            }
        });

        leer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminarp(producto.getText().toString());
            }

            private void eliminarp(String toString) {
            }
        });
        actu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    public void regresa (View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}
