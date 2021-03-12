package com.fortaleza.appfortaleza;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fortaleza.appfortaleza.model.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import dmax.dialog.SpotsDialog;

public class RegisterLugar_Activity extends AppCompatActivity {

    Button btn_registerubi;

    private EditText longitud_input;
    private EditText latitud_input;
    private EditText rasocial_input;
    private EditText nomyape_input;
    private EditText email_input;
    private EditText phone_input;
    private EditText manager_input;
    private EditText ruc_input;

    private DatabaseReference mDatabase;

    AlertDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_lugar);
        longitud_input = findViewById(R.id.longitud_input);
        latitud_input = findViewById(R.id.latitud_input);
        rasocial_input = findViewById(R.id.rasocial_input);
        nomyape_input = findViewById(R.id.nomyape_input);
        email_input = findViewById(R.id.email_input);
        phone_input = findViewById(R.id.phone_input);
        manager_input = findViewById(R.id.manager_input);
        ruc_input = findViewById(R.id.ruc_input);

        btn_registerubi = findViewById(R.id.btn_registerubi);



        //Referencia al nodo principal de Firebase
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDialog = new SpotsDialog.Builder().setContext(RegisterLugar_Activity.this).setMessage("Espere un momento").build();

        btn_registerubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    private void RegisterLugar(){
        final String longitud = longitud_input.getText().toString().trim();
        final String latitud = latitud_input.getText().toString().trim();
        final String rasocial = rasocial_input.getText().toString().trim();
        final String phone = phone_input.getText().toString().trim();
        final String email = email_input.getText().toString().trim();
        final String nomyape = nomyape_input.getText().toString().trim();
        final String manager = manager_input.getText().toString().trim();
        final String ruc = ruc_input.getText().toString().trim();

        //verificar que las cajas no esten vacias


    }

}