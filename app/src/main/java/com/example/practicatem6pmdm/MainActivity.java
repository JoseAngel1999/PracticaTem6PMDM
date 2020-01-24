package com.example.practicatem6pmdm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MenuItem poli,bloc;
    ImageButton policia;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poli = (MenuItem) findViewById(R.id.personas);
        bloc = (MenuItem) findViewById(R.id.blocdenotas);
        policia = (ImageButton) findViewById(R.id.personas);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.personas:
                Intent myitem = new Intent (MainActivity.this, Personas.class);
                startActivity(myitem);
                return false;
            case R.id.blocdenotas:
                Intent myitem2 = new Intent (MainActivity.this, BlocNotas.class);
                startActivity(myitem2);
                return false;

        }
        return  super.onOptionsItemSelected(item);
    }
    public void abrirPers(View view){
        Intent myitem3 = new Intent (MainActivity.this, Personas.class);
        startActivity(myitem3);
    }
    public void abrirBlocNotas (View view){
        Intent myitem4 = new Intent (MainActivity.this, BlocNotas.class);
        startActivity(myitem4);
    }
}
