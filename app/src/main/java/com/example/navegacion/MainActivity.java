package com.example.navegacion;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button inicio,registrar;
    EditText usuario , contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio =  (Button)findViewById(R.id.btninicio);
        registrar = (Button)findViewById(R.id.btnregistrarse);
        usuario = (EditText)findViewById(R.id.nominicio);
        contraseña  = (EditText)findViewById(R.id.contraseñainicio);


        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  nombre =  usuario.getText().toString();
                String clave  = contraseña.getText().toString();


                if(usuario.length()==0 && contraseña.length()!=0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setMessage("Introducir Usuario").setNegativeButton("Aceptar", null).create().show();

                }
                if(usuario.length()!=0 && contraseña.length()==0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setMessage("Introducir Contraseña").setNegativeButton("Aceptar", null).create().show();

                }
                if(usuario.length()==0 && contraseña.length()==0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                    alerta.setMessage("Introducir los Datos").setNegativeButton("Aceptar", null).create().show();

                }

                if(usuario.length()!=0 && contraseña.length()!=0){
                    Toast.makeText(getApplicationContext(),"Inicio Con exito "+nombre,Toast.LENGTH_LONG).show();

                    Intent i = new Intent(MainActivity.this, bienvenida.class);

                    i.putExtra("nombre", nombre);
                    i.putExtra("usuario",clave);
                    startActivity(i);
                    MainActivity.this.finish();


                }



            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Registro.class);
                startActivity(i);
            }
        });

    }
}
