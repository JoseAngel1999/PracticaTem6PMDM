package com.example.practicatem6pmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BlocNotas extends AppCompatActivity {

    Button botonguardar;
    EditText texto;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloc_notas);
        botonguardar = findViewById(R.id.button);
        texto = findViewById(R.id.editText);
        SharedPreferences prefs = getSharedPreferences("ficheroblocdenotas", Context.MODE_PRIVATE);
        texto.setText(prefs.getString("Bloc1", ""));

        botonguardar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences("ficheroblocdenotas", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("Bloc1", (texto.getText().toString()));
                editor.commit();



            }
        });
    }


}
