package com.care.eldelcare;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        getSupportActionBar().hide();
        final int duracion = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent_inicio = new Intent(Screen_Activity.this,MainActivity.class);
                startActivity(intent_inicio);
            }
        },duracion);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.azul));
        }
    }
}