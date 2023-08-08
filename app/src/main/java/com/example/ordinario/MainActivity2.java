package com.example.ordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity2 extends AppCompatActivity {

    Button guardar, leer, datos;
    TextView productos;
    EditText captura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        guardar = (Button) findViewById(R.id.guardar);
        leer = (Button) findViewById(R.id.leer);
        datos = (Button) findViewById(R.id.datos);
        captura = (EditText) findViewById(R.id.captura);
        productos = (TextView) findViewById(R.id.productos);
        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String capturado = captura.getText().toString();

                if (!capturado.equals("")) {
                    GuardarCaptura(capturado);

                } else {
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        leer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeerP();
            }
        });
    }

    private void GuardarCaptura(String capturado) {
    }

    private void LeerP() {
        String textoffile = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput(textoffile)));
            textoffile = bufferedReader.readLine();
            bufferedReader.close();
            if (textoffile != null) {
                productos.setText(textoffile);
                Toast.makeText(getApplicationContext(), "excelente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "llenar", Toast.LENGTH_SHORT).show();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "error" + e.getMessage(), Toast.LENGTH_SHORT).show();

        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "error" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

    public void regresa(View view) {
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}
