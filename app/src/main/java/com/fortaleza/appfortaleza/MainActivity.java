package com.fortaleza.appfortaleza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView homemap;

    private ImageView addubicacionmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homemap = findViewById(R.id.home_map);
        addubicacionmap = findViewById(R.id.addubicacion_map);

        homemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoMaps();

            }
        });

        addubicacionmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoAddubicacion();

            }
        });
    }

    public void GoMaps(){
        Intent intent = new Intent( MainActivity.this, MapsActivity.class);
        startActivity(intent);

    }
    public void GoAddubicacion(){
        Intent intent = new Intent( MainActivity.this, RegisterLugar_Activity.class);
        startActivity(intent);

    }
}