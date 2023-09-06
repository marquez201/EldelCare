package com.care.eldelcare;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Elegir_Cuenta_Activity extends AppCompatActivity {
    private ImageView imageViewAsistente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_cuenta);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Elegir Cuenta");
        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.azul)));
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        imageViewAsistente = (ImageView) findViewById(R.id.img_asistente);

        imageViewAsistente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrarEmpleado = new Intent(Elegir_Cuenta_Activity.this, Registrar_Empleado_Activity.class);
                startActivity(registrarEmpleado);
            }
        });
    }
}