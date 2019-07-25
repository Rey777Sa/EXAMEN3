package com.example.navegacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class profesores extends AppCompatActivity {
    Switch un,doo,tree,cua;
    Button siguiente,salirr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);

        un = (Switch)findViewById(R.id.uno);
        doo = (Switch)findViewById(R.id.dos);
        tree = (Switch)findViewById(R.id.tres);
        cua = (Switch)findViewById(R.id.cuatro);

        siguiente = (Button)findViewById(R.id.cargandodos);
        salirr = (Button)findViewById(R.id.salirdos);

        Intent i = this.getIntent();
        final String nombre = i.getStringExtra("nombre");

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"cargando maestros",Toast.LENGTH_LONG).show();
                Intent i = new Intent(profesores.this, ultima.class);
                i.putExtra("nombre", nombre);

                if(un.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"Layonet ",Toast.LENGTH_LONG).show();

                }
                if(doo.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"Magali ",Toast.LENGTH_LONG).show();

                }
                if(tree.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"Campero ",Toast.LENGTH_LONG).show();

                }
                if(cua.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"Belem ",Toast.LENGTH_LONG).show();

                }


                startActivity(i);

            }
        });

        salirr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                profesores.this.finish();
            }
        });

    }
}
