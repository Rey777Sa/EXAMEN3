package com.example.navegacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ultima extends AppCompatActivity {
    Button  salirrr, corregir;
    TextView verr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultima);


        salirrr = (Button)findViewById(R.id.salirtres);
        corregir = (Button)findViewById(R.id.corregir);

        Intent i = this.getIntent();
        final String nombre = i.getStringExtra("nombre");




        verr = (TextView)findViewById(R.id.ver);

        Intent r = this.getIntent();
        final String no = i.getStringExtra("nom");
        verr.setText(verr.getText()+" "+nombre+ " ");


        corregir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ultima.this, bienvenida.class);
                i.putExtra("nombre", nombre);
                startActivity(i);
            }
        });

        salirrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ultima.this.finish();
            }
        });
    }
}
