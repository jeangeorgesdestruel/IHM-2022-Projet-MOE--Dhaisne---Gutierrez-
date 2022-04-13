package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InfoReservation extends AppCompatActivity {

    EditText le;
    EditText de;
    EditText a;
    EditText nom;
    EditText description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_reservation);

        le = findViewById(R.id.input_le);
        de = findViewById(R.id.input_de);
        a = findViewById(R.id.input_a);
        nom = findViewById(R.id.input_nom);
        description = findViewById(R.id.input_desc);

        //Simulation d'une réservation
        le.setText("13/04/2022");
        de.setText("8h");
        a.setText("10h");
        nom.setText("IHM - Salle A201");
        description.setText("Cours IHM - Franck Silvestre");

        //Attention la modification n'est pas prise en compte dans l'étude
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
