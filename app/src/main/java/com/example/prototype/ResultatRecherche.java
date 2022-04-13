package com.example.prototype;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultatRecherche extends AppCompatActivity {

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
    }
}
