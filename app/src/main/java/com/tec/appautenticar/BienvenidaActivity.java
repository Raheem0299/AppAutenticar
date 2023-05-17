package com.tec.appautenticar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BienvenidaActivity extends AppCompatActivity {

    TextView lblBienvenida;
    TextView lblW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        //Match de la variable con la interfaz
        lblBienvenida = findViewById(R.id.lblBienvenida);
        lblW = findViewById(R.id.lblW);

        //Obtener la informacion del intent
        Intent obtenerDatos = getIntent();
        String usuarioLogueado = obtenerDatos.getStringExtra("Datos");

        //Obtener datos del objeto Persona
        Persona personaObtenida = new Persona();
        personaObtenida = (Persona) obtenerDatos.getSerializableExtra("Objeto");

        //Mostrar en la interfaz el nombre del usuario
        lblBienvenida.setText("Hola, " + personaObtenida.Nombre+" "+personaObtenida.Apellidos);
        lblW.setText("Bienvenue!");
    }
}