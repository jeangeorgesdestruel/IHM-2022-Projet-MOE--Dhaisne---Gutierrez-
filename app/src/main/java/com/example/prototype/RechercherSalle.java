package com.example.prototype;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RechercherSalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rechercher_salle);

    }

    public void rechercherSalle(View view) {
        Intent intent = new Intent(getApplicationContext(),ResultatRecherche.class);
        startActivity(intent);
    }
}