package com.tec.appautenticar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtContrasena;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se realiza match entre las variables y la UI
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);

        //Creamos variables dummies
        String usuarioDB = "Raheem";
        String contrasenaDB = "123";

        //Accion de click en el boton de Ingresar
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    String usuario = txtUsuario.getText().toString();
                    String contrasena = txtContrasena.getText().toString();
                    //Toast.makeText(MainActivity.this, "El usuario es: " + usuario, Toast.LENGTH_SHORT).show();

                    if (usuario.equals(usuarioDB) && contrasena.equals(contrasenaDB))
                    {
                        //Usuario verificado con exitp
                        //Enviar al usuario a BienvenidaActivity
                        Intent PasarPantalla = new Intent(MainActivity.this,BienvenidaActivity.class);
                        PasarPantalla.putExtra("Datos", usuario);

                        //Instanciar la clase Persona
                        Persona objetoPersona = new Persona();
                        objetoPersona.Nombre = "Raheem";
                        objetoPersona.Apellidos = "Riley Mason";
                        objetoPersona.Identificacion = "117340788";
                        objetoPersona.Telefono = 87514646;

                        //Meter en el intent el objeto de la calse persona
                        PasarPantalla.putExtra("Objeto", objetoPersona);


                        startActivity(PasarPantalla);

                    }
                    else
                    {
                        // Usuario no valido
                        Toast.makeText(MainActivity.this, "Usuario o contrasena incorrecta", Toast.LENGTH_SHORT).show();
                    }

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Ha ocurrido un problema, intentelo de nuevo", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}