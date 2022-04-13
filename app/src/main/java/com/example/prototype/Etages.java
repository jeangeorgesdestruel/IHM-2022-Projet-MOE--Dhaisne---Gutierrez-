package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Etages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etages);

    }

    public void afficherSalles(View view) {
        Intent intent = new Intent(getApplicationContext(),Salles.class);
        startActivity(intent);
    }

}