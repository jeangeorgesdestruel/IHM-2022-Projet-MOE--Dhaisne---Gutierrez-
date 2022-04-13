package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ReserverSalle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulairereserversalle);
    }

    public void reservationOk(View view) {
        Intent intent = new Intent(getApplicationContext(),ReservationOk.class);
        startActivity(intent);
    }
}
