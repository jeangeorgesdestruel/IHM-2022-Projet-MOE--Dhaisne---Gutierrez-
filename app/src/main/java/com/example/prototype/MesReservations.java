package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MesReservations extends AppCompatActivity {

    ListView listeMesReservations;

    ArrayAdapter<String> adaptateur;

    String[] resultatReservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mes_reservations);

        listeMesReservations = (ListView) findViewById(R.id.resultat_recherche);

        resultatReservation = getResources().getStringArray(R.array.mesReserv);

        adaptateur = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, resultatReservation);

        listeMesReservations.setAdapter(adaptateur);
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
                mesReservations();
                break;
            case R.id.option_retour_accueil:
                retourAccueil();
                break;

        }
        return (super.onOptionsItemSelected(item));
    }

    public void retourAccueil() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    public void mesReservations() {
        Intent intent = new Intent(getApplicationContext(),MesReservations.class);
        startActivity(intent);
    }
}
