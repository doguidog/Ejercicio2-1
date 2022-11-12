package com.example.ejercicio2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.VideoView;

public class ActivityLista extends AppCompatActivity {

    private String[] lista;
    ImageView btnreproducir,btnatras;
    Spinner spinner;
    VideoView pantalla2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        casteo();

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(getApplicationContext(),MainActivity.class);
                intencion.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intencion);
                finish();

            }
        });

        ArrayAdapter<String> adapter=new ArrayAdapter<>( this, android.R.layout.simple_spinner_item,lista);
        spinner.setAdapter(adapter);

        btnreproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                verVideo(view);
            }
        });

    }

    public void verVideo(View v) {
        int pos=spinner.getSelectedItemPosition();
        pantalla2.setVideoPath(getFilesDir()+"/"+lista[pos]);
        pantalla2.start();
    }

    public void casteo(){
        lista=fileList();
        btnreproducir = (ImageView) findViewById(R.id.btnreproducir);
        btnatras = (ImageView) findViewById(R.id.btnatras);
        spinner = (Spinner) findViewById(R.id.spinner);
        pantalla2 = (VideoView) findViewById(R.id.pantalla2);
    }

}