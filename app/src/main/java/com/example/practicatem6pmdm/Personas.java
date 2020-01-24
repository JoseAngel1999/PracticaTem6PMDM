package com.example.practicatem6pmdm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Personas extends AppCompatActivity{

    ImageButton persona1, persona2, persona3, persona4, persona5, persona6;
    Integer persona;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
        persona1 = (ImageButton) findViewById(R.id.imageButton3);
        persona2 = (ImageButton) findViewById(R.id.imageButton4);
        persona3 = (ImageButton) findViewById(R.id.imageButton5);
        persona4 = (ImageButton) findViewById(R.id.imageButton6);
        persona5 = (ImageButton) findViewById(R.id.imageButton7);
        persona6 = (ImageButton) findViewById(R.id.imageButton8);
        registerForContextMenu(persona1);
        registerForContextMenu(persona2);
        registerForContextMenu(persona3);
        registerForContextMenu(persona4);
        registerForContextMenu(persona5);
        registerForContextMenu(persona6);

        persona1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                persona =1;
            }
        });
        persona2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                persona =2;
            }
        });
        persona3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                persona =3;
            }
        });
        persona4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                persona =4;
            }
        });
        persona5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                persona =5;
            }
        });
        persona6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                persona =6;
            }
        });

        SharedPreferences prefs = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Telefono1", "632547958");
        editor.commit();

        SharedPreferences prefs2 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = prefs.edit();
        editor2.putString("Telefono2", "698564751");
        editor2.commit();

        SharedPreferences prefs3 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor3 = prefs.edit();
        editor3.putString("Telefono3", "698563333");
        editor3.commit();

        SharedPreferences prefs4 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor4 = prefs.edit();
        editor4.putString("Telefono4", "698564444");
        editor4.commit();

        SharedPreferences prefs5 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor5 = prefs.edit();
        editor5.putString("Telefono5", "698565555");
        editor5.commit();

        SharedPreferences prefs6 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor6 = prefs.edit();
        editor6.putString("Telefono6", "698566666");
        editor6.commit();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_contextual, menu);
    }

    protected void sendEmail() {
        String[] TO = {"contacto@seogalicia.es"}; //aquí pon tu correo
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
// Esto podrás modificarlo si quieres, el asunto y el cuerpo del mensaje
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Escribe aquí tu mensaje");

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcionLlamar:
                switch (persona){
                    case 1:
                        SharedPreferences prefs = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
                        String valorLeido;
                        valorLeido = prefs.getString("Telefono1", "No se encuentra");

                        if(!TextUtils.isEmpty(valorLeido)) {
                            String dial = "tel:" + valorLeido;
                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                        }
                        break;
                    case 2:
                        SharedPreferences prefs2 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
                        String valorLeido2;
                        valorLeido2 = prefs2.getString("Telefono2", "No se encuentra");

                        if(!TextUtils.isEmpty(valorLeido2)) {
                            String dial = "tel:" + valorLeido2;
                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                        }
                        break;
                    case 3:
                        SharedPreferences prefs3 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
                        String valorLeido3;
                        valorLeido3 = prefs3.getString("Telefono3", "No se encuentra");

                        if(!TextUtils.isEmpty(valorLeido3)) {
                            String dial = "tel:" + valorLeido3;
                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                        }
                        break;
                    case 4:
                        SharedPreferences prefs4 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
                        String valorLeido4;
                        valorLeido4 = prefs4.getString("Telefono4", "No se encuentra");

                        if(!TextUtils.isEmpty(valorLeido4)) {
                            String dial = "tel:" + valorLeido4;
                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                        }
                        break;
                    case 5:
                        SharedPreferences prefs5 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
                        String valorLeido5;
                        valorLeido5 = prefs5.getString("Telefono5", "No se encuentra");

                        if(!TextUtils.isEmpty(valorLeido5)) {
                            String dial = "tel:" + valorLeido5;
                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                        }
                        break;
                    case 6:
                        SharedPreferences prefs6 = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
                        String valorLeido6;
                        valorLeido6 = prefs6.getString("Telefono6", "No se encuentra");

                        if(!TextUtils.isEmpty(valorLeido6)) {
                            String dial = "tel:" + valorLeido6;
                            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                        }
                        break;
                }
                break;

            case R.id.opcionCorreo:
                switch (persona){
                    case 1:
                        sendEmail();
                        break;
                    case 2:
                        sendEmail();
                        break;
                    case 3:
                        sendEmail();
                        break;
                    case 4:
                        sendEmail();
                        break;
                    case 5:
                        sendEmail();
                        break;
                    case 6:
                        sendEmail();
                        break;
            }
            case R.id.opcionEditar:
                switch (persona) {
                    case 1:
                        startActivity(new Intent(this,Preferencias.class));
                        break;
                    case 2:
                        startActivity(new Intent(this,Preferencias.class));
                        break;
                    case 3:
                        startActivity(new Intent(this,Preferencias.class));
                        break;
                    case 4:
                        startActivity(new Intent(this,Preferencias.class));
                        break;
                    case 5:
                        startActivity(new Intent(this,Preferencias.class));
                        break;
                    case 6:
                        startActivity(new Intent(this,Preferencias.class));
                        break;
                }
                }
        return super.onContextItemSelected(item);
        }
    }