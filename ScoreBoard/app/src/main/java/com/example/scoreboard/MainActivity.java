package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int temp = 0;
    int tempo = 0;

    TextView zero, zero1;
    Button str1a, str1b, str2a, str2b, str3a, str3b, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str1a = findViewById(R.id.str1a);
        str1b = findViewById(R.id.str1b);
        str2a = findViewById(R.id.str2a);
        str2b = findViewById(R.id.str2b);
        str3a = findViewById(R.id.str3a);
        str3b = findViewById(R.id.str3b);
        reset = findViewById(R.id.reset);

        zero = findViewById(R.id.zero);
        zero1 = findViewById(R.id.zero1);

        str1a.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                temp += 1;
                zero.setText("" + temp);
            }
        });

        str1b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tempo += 1;
                zero1.setText("" + tempo);
            }
        });

        str2a.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                temp += 2;
                zero.setText("" + temp);
            }
        });

        str2b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tempo += 2;
                zero1.setText("" + tempo);
            }
        });

        str3a.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                temp += 3;
                zero.setText("" + temp);
            }
        });

        str3b.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tempo += 3;
                zero1.setText("" + tempo);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = 0;
                tempo = 0;
                zero.setText("" + temp);
                zero1.setText("" + tempo);
            }
        });


    }
}