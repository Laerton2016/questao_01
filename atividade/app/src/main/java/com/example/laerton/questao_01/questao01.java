package com.example.laerton.questao_01;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class questao01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao01);
        this.setTitle("MENU PRINCIPAL");
    }


    public void btnAlerta(View view) {
        Toast.makeText(this, "em construção", Toast.LENGTH_LONG).show();
    }

    public void btnOuvidoria(View view) {
        Intent in = new Intent(questao01.this, pagina2.class);
        startActivity(in);
    }
}
