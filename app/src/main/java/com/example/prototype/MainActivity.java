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

//        Spinner spinner = (Spinner) findViewById(R.id.categorie_spinner);
//        // Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.categorie, android.R.layout.simple_spinner_item);
//        // Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        // Apply the adapter to the spinner
//        spinner.setAdapter(adapter);
    }

//    public void onRadioButtonClicked(View view) {
//    }

    public void afficherEtages(View view) {
        Intent intent = new Intent(getApplicationContext(),Etages.class);
        startActivity(intent);
    }

    public void rechercherSalles(View view) {
        Intent intent = new Intent(getApplicationContext(),RechercherSalle.class);
        startActivity(intent);
    }
}