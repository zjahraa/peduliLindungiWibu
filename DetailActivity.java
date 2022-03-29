package com.example.pedulilindungiwibu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class DetailActivity extends AppCompatActivity {

    EditText namakamu, namahusbuWaifu;
    Button teskecocokan;
    TextView hasil;
    String namaorang, nama2d;
    String[] jawaban = {"dosa!!","nggaboleh halu","yang real masih banyak kamu ngga cocok sama yang gepenk ", " sadar diri"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namakamu = findViewById(R.id.namakamu_edittext);
        namahusbuWaifu = findViewById(R.id.namahsubu_edittext);
        teskecocokan = findViewById(R.id.testkecocokan_button);
        hasil = findViewById(R.id.hasil_textview);

        teskecocokan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaorang = namakamu.getText().toString();
                nama2d = namahusbuWaifu.getText().toString();

                if (namaorang.isEmpty() && nama2d.isEmpty()){
                    Toast.makeText(DetailActivity.this, "isikan kolom nama dengan namu dan kolom husbu/waifu dengan nama husbu/waifumu", Toast.LENGTH_SHORT).show();
                    hasil.setText(" ");
                }else if (namaorang.isEmpty()){
                    Toast.makeText(DetailActivity.this, "masukkan namamu", Toast.LENGTH_SHORT).show();
                    hasil.setText(" ");
                }else if (nama2d.isEmpty()){
                    Toast.makeText(DetailActivity.this, "masukkan nama husbu/waifumu", Toast.LENGTH_SHORT).show();
                    hasil.setText(" ");
                }else {
                    Random random = new Random();
                    int r = random.nextInt(jawaban.length);

                    hasil.setText(jawaban[r]);
                }
            }
        });

        }
}