package com.example.pedulilindungiwibu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tombolmulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolmulai = findViewById(R.id.start_btn);

        tombolmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "mulai!!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this,DetailActivity.class);
                startActivity(i);
            }
        });

    }
}