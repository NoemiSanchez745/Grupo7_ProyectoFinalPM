package com.example.grupo7_proyectofinalpm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //overflow
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    //metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow,menu);
        return true;
    }
    //asignamos funciones a las opciones del menu over flow
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.item2)
        {
            Toast.makeText(this,"Click Crear Nuevo Formulario",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.item1)
        {
            Toast.makeText(this,"Click en Quienes Somos",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.item3)
        {
            Toast.makeText(this,"Click en Salir",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}