package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batiments);

    }


    public void afficherEtages(View view) {
        Intent intent = new Intent(getApplicationContext(),Etages.class);
        startActivity(intent);
    }

    public void rechercherSalles(View view) {
        Intent intent = new Intent(getApplicationContext(),RechercherSalle.class);
        startActivity(intent);
    }
}