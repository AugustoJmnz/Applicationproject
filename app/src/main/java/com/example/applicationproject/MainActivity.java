package com.example.applicationproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button Button, Button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = findViewById(R.id.si);
        Button.setOnClickListener(v -> Toast.makeText(getApplicationContext(),
                "¡Sabía que dirías que sí!", Toast.LENGTH_LONG).show());
        Button2 = findViewById(R.id.no);
        Button2.setOnClickListener(v -> Toast.makeText(getApplicationContext(),
                "¡¡Virus Detectado!! ¡Seleciona otro botón!", Toast.LENGTH_LONG).show());


    }
}
