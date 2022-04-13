package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultatRecherche extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listeResultatRecherche;

    ArrayAdapter<String> adaptateur;

    String[] resultatRecherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultatrech);

        listeResultatRecherche = (ListView) findViewById(R.id.resultat_recherche);

        resultatRecherche = getResources().getStringArray(R.array.resultRecherche);

        adaptateur = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, resultatRecherche);

        listeResultatRecherche.setAdapter(adaptateur);

        listeResultatRecherche.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent intent = new Intent(getApplicationContext(),InfoSalleRecherche.class);
        startActivity(intent);
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
            case R.id.option_mes_reservations :
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
