package com.example.prototype;

import android.os.Bundle;
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
}
