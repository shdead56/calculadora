package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declarar variable global para controlaor
    EditText txtNro1, txtNro2, txtRes ;
    Button btnSumar, btnRestar, btnMulti, btnDivi, btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //escuhcar controles
        txtNro1= (EditText) findViewById(R.id.txtNro1);
        txtNro2= (EditText) findViewById(R.id.txtNro2);
        btnSumar=(Button) findViewById(R.id.btnSuma);
        btnRestar=(Button) findViewById(R.id.btnResta);
        btnDivi=(Button) findViewById(R.id.btnDivi);
        btnMulti=(Button) findViewById(R.id.btnMulti);
        btnSalir=(Button) findViewById(R.id.btnSalir);
        txtRes=(EditText) findViewById(R.id.txtRes);
        // Proceso de evento
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();            }
        });
        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir();
            }
        });

    }

    private void Dividir() {
        double nro1= Double.valueOf(txtNro1.getText().toString());
        double nro2= Double.valueOf(txtNro2.getText().toString());
        if(nro2 == 0)
            txtRes.setText("Error division entre cero");
        else{
            double Division= nro1/nro2;
            txtRes.setText(String.valueOf(Division));
        }
    }

    private void Sumar() {
        double nro1= Double.valueOf(txtNro1.getText().toString());
        double nro2= Double.valueOf(txtNro2.getText().toString());
        double suma= nro1 + nro2;
        txtRes.setText(String.valueOf(suma));
    }
}