package com.example.navegacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class bienvenida extends AppCompatActivity {
     TextView  mensaje;
     RadioButton a,b;
     CheckBox app,aud,sis,nego;
     Button cargando,saliendo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        a = (RadioButton)findViewById(R.id.a1);
        b = (RadioButton)findViewById(R.id.b2);
        app = (CheckBox)findViewById(R.id.aplicaciones);
        aud = (CheckBox)findViewById(R.id.auditoria);
        sis = (CheckBox)findViewById(R.id.sistemas);
        nego = (CheckBox)findViewById(R.id.negociacion);
        cargando = (Button)findViewById(R.id.cargar);
        saliendo = (Button)findViewById(R.id.salir);
        mensaje = (TextView)findViewById(R.id.mensajeinput);

        Intent i = this.getIntent();
        final String nombre = i.getStringExtra("nombre");
        mensaje.setText(mensaje.getText()+"Hola : "+nombre+ " ");

        cargando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cargando "+nombre +" y Materias",Toast.LENGTH_LONG).show();
                Intent i = new Intent(bienvenida.this, profesores.class);
                i.putExtra("nombre", nombre);
                startActivity(i);

            }
        });

        saliendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bienvenida.this.finish();
            }
        });

    }
}
