package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ReserverSalle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulairereserversalle);

        Spinner spinner = (Spinner) findViewById(R.id.categorie_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.categorie, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
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

    public void reservationOk(View view) {
        Intent intent = new Intent(getApplicationContext(),ReservationOk.class);
        startActivity(intent);
    }
}
