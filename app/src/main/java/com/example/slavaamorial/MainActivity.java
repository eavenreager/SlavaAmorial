package com.example.slavaamorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button brgmasuk,topenyimpanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brgmasuk = (Button) findViewById(R.id.tobarangmasuk);
        topenyimpanan = (Button)findViewById(R.id.topenyimpanan);

        brgmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent brgmasuk = new Intent(MainActivity.this, BarangMasukActivity.class);
                startActivity(brgmasuk);
            }
        });
        topenyimpanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent penyimpanan = new Intent(MainActivity.this, PenyimpananActivity.class);
                startActivity(penyimpanan);
            }
        });
    }
}