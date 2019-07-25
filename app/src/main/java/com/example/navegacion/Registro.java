package com.example.navegacion;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
   EditText nombre,usuario,numero,apellido;
   RadioButton informatica,gestion,civil;
   Button agregar, ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText)findViewById(R.id.Rnombre);
        apellido = (EditText)findViewById(R.id.Rapellidos);
        usuario = (EditText)findViewById(R.id.Rusuario);
        numero = (EditText)findViewById(R.id.Rnumero);

        informatica = (RadioButton)findViewById(R.id.inf);
        gestion = (RadioButton)findViewById(R.id.gest);
        civil = (RadioButton)findViewById(R.id.civ);

        agregar = (Button)findViewById(R.id.reg);
        ingresar = (Button)findViewById(R.id.ingre);


        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = nombre.getText().toString();
                String ape = apellido.getText().toString();
                String usu = usuario.getText().toString();

                if(nombre.length()==0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(Registro.this);
                    alerta.setMessage("Introducir Nombre").setNegativeButton("Aceptar", null).create().show();

                }
                if(apellido.length()==0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(Registro.this);
                    alerta.setMessage("Introducir apellido").setNegativeButton("Aceptar", null).create().show();

                }
                if(usuario.length()==0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(Registro.this);
                    alerta.setMessage("Introducir usuario").setNegativeButton("Aceptar", null).create().show();

                }
                if(numero.length()==0){
                    AlertDialog.Builder alerta = new AlertDialog.Builder(Registro.this);
                    alerta.setMessage("Introducir N.control").setNegativeButton("Aceptar", null).create().show();

                }


                if(nombre.length()!=0 && apellido.length()!=0 && usuario.length()!=0 && numero.length()!=0 ){
                    Toast.makeText(getApplicationContext(),"Registro con exito "+nom+" "+ape+" "+usu+" ",Toast.LENGTH_LONG).show();


                }
            }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registro.this, MainActivity.class);
                startActivity(i);
                Registro.this.finish();
            }
        });


    }
}
