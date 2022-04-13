package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Salles extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salles);

    }

    public void reserverSalle(View view) {
        Intent intent = new Intent(getApplicationContext(),InfoSalle.class);
        startActivity(intent);
    }
}
