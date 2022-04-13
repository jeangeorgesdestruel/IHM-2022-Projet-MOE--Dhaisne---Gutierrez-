package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batiments);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        new MenuInflater(this).inflate(R.menu.menu_options, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // selon l'option sélectionnée dans le menu, on réalise le traitement adéquat
        switch(item.getItemId()) {
            case R.id.option_mes_reservations :  		 // ajout d'une nouvelle cuisson
//                saisirAjouterCuisson();
                break;
            case R.id.option_retour_accueil:
//                saisirRechercherAliment();
                break;

        }
        return (super.onOptionsItemSelected(item));
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