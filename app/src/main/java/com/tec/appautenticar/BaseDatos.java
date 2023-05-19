package com.tec.appautenticar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context context)
    {
        super(context, "BD_USUARIOS", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE IF NOT EXISTS TABLA_USUARIOS (nombreCompleto TEXT, usuario TEXT, contrasena TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

        //Metodo para registrar usuarios
        public boolean RegistrarUsuario(String nombreCompleto, String usuario, String contrasena)
        {
            return true;
        }

        public boolean AutenticarUsuario(String usuario, String contrasena)
        {
            return true;
        }


}
