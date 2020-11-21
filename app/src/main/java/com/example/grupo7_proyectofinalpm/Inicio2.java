package com.example.grupo7_proyectofinalpm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Inicio2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent entrar=new Intent(Inicio2.this,MainActivity.class);
                startActivity(entrar);
            }
        },3000);
    }
}