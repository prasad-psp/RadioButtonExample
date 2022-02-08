package com.psp.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rdoMale,rdoFemale;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rdoGroup);
        btnSave = findViewById(R.id.buttonSave);
        rdoMale = findViewById(R.id.rdoMale);
        rdoFemale = findViewById(R.id.rdoFemale);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rdoMale.isChecked()) {
                    Toast.makeText(MainActivity.this, "Male selected", Toast.LENGTH_SHORT).show();
                }

                if(rdoFemale.isChecked()) {
                    Toast.makeText(MainActivity.this, "Female selected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}