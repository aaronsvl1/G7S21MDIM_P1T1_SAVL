package com.example.g7s21mdim_p1t1_savl;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText txtedad;
    Button btnedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtedad = findViewById(R.id.txtedad);
        btnedad = findViewById(R.id.btnedad);

        btnedad.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String edadStr = txtedad.getText().toString();

                if (!edadStr.isEmpty()) {
                    int edad = Integer.parseInt(edadStr);

                    if (edad < 18) {
                        Intent intent = new Intent(MainActivity.this, MenorActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(MainActivity.this, MayorActivity.class);
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingresa una edad válida.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
